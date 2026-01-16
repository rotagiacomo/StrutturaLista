public class Nodo {
    private String value;
    private Nodo next;

    public Nodo getNext(){
        return next;
    }

    public void setNext(Nodo nextNodo){
        next = nextNodo;
    }

    public String getValue(){
        return value;
    }

    public Nodo(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }
}