package Hilos;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;

public class SaveTools {
    /**
     * Este metodo es capaz de crear carpetas apartir de su localizacion
     * @param path
     */
    public static void createFolders(String path){
        try {
         File file = new File(path);
         file.mkdirs(); 
        } catch (Exception e) {
            System.out.println(e+" (Error al crear carpetas)");
        }
    }
    /**
     * Metodo que crea una path a partir de su raiz, su md5 y el nombre del archivo
     * @param root
     * @param md5
     * @param text
     * @return
     */
    public static String generatePath(String root, String md5){
        String path="";
        for (char letra : md5.toCharArray()) {
            path += letra+"\\";
        }
        return root+"\\"+path;
    }
    /**
     * Genera el md5 de un string
     * @param input
     * @return
     */
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
