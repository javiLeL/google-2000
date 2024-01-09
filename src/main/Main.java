package main;

import java.util.Arrays;

import Hilos.UrlTools;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(UrlTools.procesadorPalabras(HtmlPrueba.html)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}