public class Main {
    public static void main(){
        Lista lista = new Lista();
        lista.inserimentoInOrdineAlfabetico("mamma");
        lista.inserimentoInOrdineAlfabetico("casa");
        lista.inserimentoInOrdineAlfabetico("aba");
        System.out.println(lista);
        lista.inserimento(0, "bab");
        System.out.println(lista);
    }
}
