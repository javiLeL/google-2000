package Hilos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UrlTools {
    private static final char[] PUNTUACION = {',', '.', ':', ';', '!', '?', '¡', '¿'};
    private static final String[] ETIQUETA_IGNORE = {"style", "script"}, ETIQUETA_LINK = {"a", "link"};
    /**
     * Metodo que extrae el html fuente apartir de un url
     * @param urlString
     * @return
     * @throws Exception
     */
    public static String htmlExtractor(String urlString) throws Exception{
        String codigo="", linea;
        URL url = new URL(urlString);
        URLConnection conexion = url.openConnection();
        conexion.setDoOutput(true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        while ((linea = reader.readLine()) != null) {
            codigo += linea;        
        }
        return codigo;
    }
    /**
     * Metodo que guarda el html en su archivo html
     * @param url
     */
    public static void writeHtml(String url){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(url+".html"))){
            bufferedWriter.write(htmlExtractor("https://"+url));
        } catch (Exception e) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(url+".html"))){
                bufferedWriter.write(htmlExtractor(url.replace("www.", "http://")));
            }catch (Exception ex) {
                System.out.println("Al guardar el url: "+url);
            }
        }
    }
    /**
     * Metodo capaz de borrar las palabras de un texto 
     * Estas palabras se encuentran dentro del archivo "words-ignore.txt"
     * @return
     */
    public static String deleteWords(String text){
        text = " "+text.toLowerCase()+" ";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("words-ignore.txt"))){
            String palabraEliminar;
            while ((palabraEliminar=bufferedReader.readLine())!=null) {
                if(!palabraEliminar.startsWith("#")){
                    text = text.replace(" "+palabraEliminar.toLowerCase().trim()+" ", " ");
                }
            }
            // Modifica los caracteres en blanco por espacios
            text = text.replaceAll("\\s+", " ");
            // Elimina los caracteres en blanco del principio y del final
            text = text.trim();
        } catch (Exception e) {
            System.out.println(e);
        }
        return text;
    }
    /**
     * Metodo que elimina las etiquetas de un html dejando su contenido
     * @param text
     * @return
     */
    public static String deleteEtiquetas(String text){
        String resultado="";
        boolean escribir = true;
        for (String etiquetaAIgnorar : ETIQUETA_IGNORE) {
            text = deleteContentOff(etiquetaAIgnorar, text);
        }
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
     * Metodo que elimina un etiqueta de un html con su contenido
     * @param text
     * @return
     */
    public static String deleteContentOff(String etiquetaName, String text){
        String resultado="";
        boolean escribir = true;
        for(int i=0;i<text.length();i++){
            if (text.indexOf("<"+etiquetaName+">", i)==i) {
                escribir = false;
            }else if(text.indexOf("</"+etiquetaName+">", i)==i){
                escribir = true;
                i+=etiquetaName.length()+2;
            }
            if (escribir) {
                resultado += text.charAt(i); 
            }
        }
        resultado = resultado.equals("") ? null:resultado;
        return resultado;
    }
    /**
     * Metodo capaz de eliminar los signos de PUNTUACION como ",",".",";",...
     * @param texto
     * @return
     */
    public static String deleteSignos(String texto){
        for (char caracterEliminar : PUNTUACION) {
            texto = texto.replace(String.valueOf(caracterEliminar), " ");
        }
        return texto;
    }
    /**
     * Metodo capaz de extraer el conjunto de etiquetas <x x="x"> o <x x="x"/> de un archivo html
     * esta etiqueta debe de guardar por lo menos un atributos sino se saltara
     * @param html
     * @return
     */
    private static List<String> etiquetaExtractor(String etiqueta, String html){
        List<String> resultado = new ArrayList<>();
        int aux=0;
        while (html.indexOf("<"+etiqueta+" ", aux) != -1) {
            String etiquetaEncontrada="";
            for(int i = html.indexOf("<"+etiqueta+" ", aux); i<html.indexOf(">", aux)+1;i++){
                etiquetaEncontrada += html.charAt(i);
            }
            aux = html.indexOf(">", aux)+1;
            if (!etiquetaEncontrada.equals("")) {
                resultado.add(etiquetaEncontrada);   
            }
        }
        return resultado;
    }
        /**
     * Metodo capaz de extraer el link apartir de un elemento "x" el cual posea un atributo href
     * ejemplo: <a href="link">
     * @param element
     * @return
     */
    private static String linkExtractorElement(String element){
        String link = null;
        if (element.indexOf("href=\"")!=-1){
            link = "";
            for(int i=element.indexOf("href=\"", 0)+6;i<element.indexOf("\"", element.indexOf("href=\"", 0)+6);i++){
                link += element.charAt(i);
            }
        }
        // Esto es ajustable para poder especificar el tipo como http o https u en este caso ambas
        // link = link.startsWith(url+"/")?link:null;
        return link;
    }
    /**
     * Metodo capaz de extraer los links de un html
     * @param html
     * @return
     */
    public static Set<String> linksExtractor(String html){
        Set<String> resutado = new HashSet<>();
        for (String etiquetaLink : ETIQUETA_LINK) {
            resutado.addAll(etiquetaExtractor(etiquetaLink, html));
        }
        resutado = resutado.stream().map(UrlTools::linkExtractorElement).collect(Collectors.toSet());
        return resutado;
    }
}