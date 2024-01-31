package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Hilos.SaveTools;

public class Main {
    final static String raiz = "folder";
    static List<String> palabras;
    public static void main(String[] args) {
        palabras = new ArrayList<>(Arrays.asList(new String[]{
            "www.elpais.es",
            "www.abc.es",
            "www.elmundo.es",
            "www.20minutos.es",
            "www.ivoox.com",
            "www.google.es",
            "www.meneame.net",
            "www.as.es",
            "www.marca.es",
            "www.elcorteingles.es",
            "www.ibm.es",
            "www.oracle.es",
            "www.microsoft.es",
            "www.valladolid.es",
            "www.fmdva.org"

        }));
        palabras.stream()
            .map(x->SaveTools.getMD5(x))
            .map(x->SaveTools.generatePath(raiz, x))
            .forEach(SaveTools::createFolders);
    }
}