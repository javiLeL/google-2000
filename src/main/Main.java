package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Hilos.SaveTools;
import Hilos.UrlTools;

public class Main {
    final static String raiz = "folder";
    static List<String> palabras;
    public static void main(String[] args) {
        palabras = new ArrayList<>(Arrays.asList(UrlTools.procesadorPalabras(HtmlPrueba.html)));
        palabras.stream()
            .map(x->SaveTools.getMD5(x))
            .map(x->SaveTools.generatePath(raiz, x))
            .forEach(SaveTools::createFolders);
    }
}