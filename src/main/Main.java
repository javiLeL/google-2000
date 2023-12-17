package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        // System.out.println(etiquetaLinkExtractor("mas resto del html <a href=\"uwu\"> hola </a> el resto del html XD mamon <a href=\"soy un link\"> link :D </a> no te lo vas a creer aqui ya mas WOOOO"));
        etiquetaLinkExtractor(htmlExtractor("https://es.wikipedia.org/wiki/Wiki")).stream().forEach(System.out::println);
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