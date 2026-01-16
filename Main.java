public class Main {
    public static void main(){
        Lista lista = new Lista();
        lista.accoda("ab");
        lista.accoda("cd");
        lista.accoda("vgvg");
        System.out.println(lista.visita(2));
        System.out.println(lista.visita(0));
    }
}
