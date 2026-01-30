public class Lista {
    private Nodo head;
    private int size;

    public String lettura(int indice){
        Nodo cursor = raggiungiIndice(indice);
        return cursor.toString();
    }

    public void accodaNodo(Nodo nodo, Nodo cursor){
        nodo.setNextNodo(cursor.getNextNodo());
        cursor.setNextNodo(nodo);
        size++;
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
            aggiungiNodo(new Nodo(valore), cursor);
        }else{
            cursor.getNextNodo().setContenuto(valore);
        }
    }

    private Nodo raggiungiIndice(int indice){
        Nodo cursor = head;
        for(int i = 0; i<=indice; i++){
            cursor = cursor.getNextNodo();
        }
        return cursor;
    }

    private void aggiungiNodo(Nodo nodo , Nodo cursor){
        cursor.setNextNodo(nodo);
        size++;
    }

    public void eliminazione(int indice){
        Nodo cursor = raggiungiIndice(indice-1);
        Nodo temp = cursor;
        cursor = cursor.getNextNodo();
        temp.setNextNodo(cursor.getNextNodo());
        size--;
    }

    public int ricerca(String valore){
        Nodo cursor = head.getNextNodo();
        int indice = 0;
        while (cursor.getNextNodo() != null && cursor.toString() == null || !cursor.toString().equals(valore)) {
            cursor = cursor.getNextNodo();
            indice++;
        }
        return indice;
    }

    public void eliminazioneCompleta(String valore){
        boolean condition = true;
        while (condition) {
            try{
                int indice = ricerca(valore);
                eliminazione(indice);
            }catch(NullPointerException exception){
                condition = false;
            }
        }
    }

    public void inserimentoInOrdineAlfabetico(String valore){
        Nodo cursor = head;
        for(int i=0; i<size && cursor.getContenuto() != null; i++){
            int risultatoCompare = valore.compareToIgnoreCase(cursor.getContenuto());
            if (risultatoCompare < 0) {
                break;
            }
            cursor=cursor.getNextNodo();
        }
        Nodo newNodo = new Nodo(valore);
        accodaNodo(newNodo, cursor);
    }

    public String toString(){
        Nodo cursor = head.getNextNodo();
        String string = "";
        for(int i=0; i<size; i++){
            string += cursor.toString();
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