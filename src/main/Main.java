package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import Hilos.Hilos;
import Hilos.UrlTools;

public class Main {
    private static int ultimoSeed = 0;
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        
        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(new Hilos());
            threads[i].setName((i+1)+"");
            // threads[i].start();
        }
        try {
            UrlTools.linksExtractor(UrlTools.htmlExtractor("https://wiki.archlinux.org/")).stream().forEach(System.out::println);;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static synchronized String readSeed(){
        String resultado=null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("seed.txt"))){
            for(int i=0;i<=ultimoSeed;i++){
                resultado = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error no existe el archivo seed");
        }
        // System.out.println(Thread.currentThread().getName() +"//"+ ultimoSeed);
        ultimoSeed = resultado!=null?ultimoSeed+1:ultimoSeed;
        return resultado;
    }
    
    public static synchronized void writeLog(String url, String file){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
            bufferedWriter.write(url);
        } catch (Exception e) {
            System.out.println("Error no se pudo guardar en el archivo");
        }
    }
}