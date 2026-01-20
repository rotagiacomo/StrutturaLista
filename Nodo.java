public class Nodo {
    private Nodo nextNodo;
    private String contenuto;

    public String getContenuto(){
        return contenuto;
    }

    public Nodo getNextNodo(){
        return nextNodo;
    }

    public void setNextNodo(Nodo nextNodo){
        this.nextNodo = nextNodo;
    }

    public Nodo(String contenuto){
        this.contenuto = contenuto;
    }
}