public class Lista {
    private int size = 0;
    public Nodo head;
    private Nodo cursor;

    public void accoda(String value){
        if (head == null) {
            head = new Nodo(value);
        }else{
            raggiungiIndice(size-1);
            aggiungi(value);
            cursor = head;
        }
        size++;
    }

    public void rimuovi(int indice){
        raggiungiIndice(indice);
        
    }

    public String visita(int indice){
        raggiungiIndice(indice);
        String valore = cursor.getValue();
        cursor = head;
        return valore;
    }

    public void raggiungiIndice(int indice){
        cursor = head;
        for(int i=0; i<indice; i++){
            cursor = cursor.getNext();
        }
    }

    public void aggiungi(String value){
        cursor.setNext(new Nodo(value));
    }
}