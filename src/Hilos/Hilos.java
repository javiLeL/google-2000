package Hilos;

public class Hilos implements Runnable{
    @Override
    public void run() {
        String url;

        while((url=readSeed())!=null){
            // System.out.println("El hilo "+Thread.currentThread().getName()+" Analiza el url: " + url);
            try {
                Thread.sleep((int)(Math.random()*2000+1000));
            } catch (Exception e) {
                System.out.println(e);
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