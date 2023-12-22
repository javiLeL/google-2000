package Hilos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlTools {
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
}