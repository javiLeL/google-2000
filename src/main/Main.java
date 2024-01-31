package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Hilos.SaveTools;

public class Main {
    final static String raiz = "folder";
    static List<String> palabras;
    public static void main(String[] args) {
        palabras = new ArrayList<>(Arrays.asList(new String[]{"libro", "casa", "árbol", "perro", "gato", "sol", "luna", "nube", "estrella", "montaña", "río", "mar", "flor", "pájaro", "insecto", "animal", "persona", "mundo"}));
        palabras.stream()
            .map(x->SaveTools.getMD5(x))
            .map(x->SaveTools.generatePath(raiz, x))
            .forEach(SaveTools::createFolders);
    }
}