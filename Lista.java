public class Lista {
    private Nodo head;
    private int size;

    public String lettura(int indice){
        Nodo cursor = head.getNextNodo();
        String contenuto = null;
        for (int i=0; i<=indice; i++){
            cursor = cursor.getNextNodo();
        }
        contenuto = cursor.getContenuto();
        return contenuto;
    }

    public void accoda(String valore){
        Nodo cursor = head;
        while (cursor.getNextNodo() != null){
            cursor = cursor.getNextNodo();
        }
        aggiungiNodo(valore, cursor);
    }

    public void inserimento(int indice, String valore){
        Nodo cursor = head;
        for(int i=0; i<indice; i++){
            if (cursor.getNextNodo() == null) {
                aggiungiNodo(null, cursor);
            }
            cursor = cursor.getNextNodo();
        }
        if (cursor.getNextNodo() == null) {
            aggiungiNodo(valore, cursor);
        }else{
            cursor.getNextNodo().setContenuto(valore);
        }
    }

    private void aggiungiNodo(String contenuto, Nodo cursor){
        cursor.setNextNodo(new Nodo(contenuto));
        size++;
    }

    public String toString(){
        Nodo cursor = head.getNextNodo();
        String string = "";
        for(int i=0; i<size; i++){
            string += cursor.getContenuto();
            if (i<size-1) {
                string += ", ";
            }
            cursor = cursor.getNextNodo();
        }
        return string;
    }

    public int getSize(){
        return size;
    }

    public Lista(){
        head = new Nodo(null);
        size = 0;
    }
}