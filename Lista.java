public class Lista {
    private Nodo head = new Nodo(null);
    private Nodo cursor;
    private int size = 0;

    private String visita(){
        String contenuto = cursor.getContenuto();
        cursor = cursor.getNextNodo();
        return contenuto;
    }

    public String lettura(int indice){
        cursor = head.getNextNodo();
        String contenuto = null;
        for (int i=0; i<=indice; i++){
            contenuto = visita();
        }
        return contenuto;
    }

    public void accoda(String valore){
        cursor = head;
        while (cursor.getNextNodo() != null){
            visita();
        }
        cursor.setNextNodo(new Nodo(valore));
        size++;
    }

    public void inserimento(int indice, String valore){
        cursor = head.getNextNodo();
        for(int i=0; i<indice-1; i++){
            if (cursor.getNextNodo() == null) {
                aggiungiNodo(null);
            }
            cursor = cursor.getNextNodo();
        }
        if (cursor.getNextNodo() == null) {
            aggiungiNodo(valore);
        }else{
            cursor.getNextNodo().setContenuto(valore);
        }
    }

    private void aggiungiNodo(String contenuto){
        cursor.setNextNodo(new Nodo(contenuto));
        size++;
    }

    public String toString(){
        cursor = head.getNextNodo();
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
}