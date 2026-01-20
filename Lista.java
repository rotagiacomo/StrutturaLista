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

    public int getSize(){
        return size;
    }
}