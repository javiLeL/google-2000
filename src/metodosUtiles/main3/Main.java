package metodosUtiles.main3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        System.out.println(deleteEtiquetas(""));
    }
    
    static public List<LinkWord> urlToListOfLinks(String url){
        List<LinkWord> listaLinksWords = new ArrayList<>();
        for(int i=0;i<etiquetaLinkExtractor(htmlExtractor(url)).size();i++){
            String link, word = deleteEtiquetas(wordStractorElemet(etiquetaLinkExtractor(htmlExtractor(url)).get(i)));
            if((link=linkStractorElement(etiquetaLinkExtractor(htmlExtractor(url)).get(i)))!=null && word!=null){
                listaLinksWords.add(new LinkWord(link, word));
                // System.out.println(link+" --> "+word);
            }
        }
        return listaLinksWords;
    }

    /**
     * Metodo capaz de extraer el conjunto de etiquetas <a> ... </a> de un archivo html
     * @param html
     * @return
     */
    static public List<String> etiquetaLinkExtractor(String html){
        List<String> resultado = new ArrayList<>();
        int aux=0;
        // Busca la etiqueta <a ... > ... </a> y la extrae
        while (html.indexOf("<a ", aux) != -1) {
            String a="";
            for(int i = html.indexOf("<a ", aux); i<html.indexOf("</a>", aux)+4;i++){
                a += html.charAt(i);
            }
            aux = html.indexOf("</a>", aux)+4;
            resultado.add(a);
        }

        return resultado;
    }

    /**
     * Metodo capaz de extraer una palabra de dentro de un html
     * @param element
     * @return
     */
    static String wordStractorElemet(String element){
        String palabra="";
        if (element.indexOf("href=\"")!=-1){
            palabra = "";
            for(int i=element.indexOf(">")+1;i<element.indexOf("</a>");i++){
                palabra += element.charAt(i);
            }
        }
        return palabra;
    }

    /**
     * Metodo capaz de eliminar
     * @param text
     * @return
     */
    static String deleteEtiquetas(String text){
        String resultado="";
        boolean escribir = true;
        for(int i=0;i<text.length();i++){
            if (text.charAt(i)=='<') {
                escribir = false;
            }else if(text.charAt(i)=='>'){
                escribir = true;
            }

            if (escribir && !(text.charAt(i)=='>')) {
                resultado += text.charAt(i); 
            }
        }
        resultado = resultado.equals("") ? null:resultado;
        return resultado;
    }

    /**
     * Metodo capaz de extraer el link apartir de un elemento <a href="link"> ... </a>
     * @param element
     * @return
     */
    static String linkStractorElement(String element){
        String link = null;
        if (element.indexOf("href=\"")!=-1){
            link = "";
            for(int i=element.indexOf("href=\"", 0)+6;i<element.indexOf("\"", element.indexOf("href=\"", 0)+6);i++){
                link += element.charAt(i);
            }
        }
        // Esto es ajustable para poder especificar el tipo como http o https u en este caso ambas
        link = link.startsWith("http")?link:null;
        return link;
    }

    /**
     * Metodo capaz de extrer un html de la red
     * @param urlString
     * @return
     */
    public static String htmlExtractor(String urlString){
        String codigo="", linea;
        try {
            URL url = new URL(urlString);
            URLConnection conexion = url.openConnection();
            conexion.setDoOutput(true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            while ((linea = reader.readLine()) != null) {
                codigo += linea;        
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return codigo;
    }
}