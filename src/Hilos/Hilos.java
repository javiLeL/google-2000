package Hilos;

public class Hilos implements Runnable{
    @Override
    public void run() {
        String url;

        while((url=readSeed())!=null){
            try {
                System.out.println("El hilo "+Thread.currentThread().getName()+" Inicio el analisis de: "+url);
                UrlTools.writeHtml(url);
                System.out.println("El hilo "+Thread.currentThread().getName()+" Termino el analisis de: "+url);
            } catch (Exception e) {
                writeLog(url+"\t[Error]");
            }
            writeLog(url);
        }
    }
    private String readSeed(){
        return main.Main.readSeed();
    }
    private void writeLog(String url){
        main.Main.writeLog(url+"\n", "hilo"+Thread.currentThread().getName());
    }
}