public class Main {
    public static void main(){
        Lista lista = new Lista();
        lista.accoda("mamma");
        lista.inserimento(1, "casa");
        lista.accoda("ciao");
        lista.accoda("mamma");
        lista.accoda("camera");
        System.out.println(lista.ricerca("casa"));
        System.out.println(lista);
        lista.eliminazione(2);
        System.out.println(lista);
        System.out.println(lista.lettura(3));
        lista.eliminazioneCompleta("mamma");
        System.out.println(lista);
    }
}
