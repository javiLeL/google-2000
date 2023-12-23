package metodosUtiles.main3;

public class LinkWord {
    private String link, word;
    
    LinkWord(String link, String word){
        this.link = link;
        this.word = word;
    }

    /**
     * Devuelve el link asignado
     * @return
     */
    public String getLink() {
        return link;
    }

    /**
     * Devuelve la palabra asignada 
     * @return
     */
    public String getWord() {
        return word;
    }
    /**
     * Metodo para devolver la clase como un String
     * @return 
     */
    @Override
    public String toString() {
        return "Link: "+link+", Word: "+word;
    }
}