package main;

import Hilos.UrlTools;

public class Main {
    public static void main(String[] args) {
        try {
            UrlTools.linksExtractor(HtmlPrueba.html).stream().forEach(System.out::println);;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}