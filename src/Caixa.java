
public class Caixa {

    Caixa() {
        contador++;
    }
    public static int contador = 0;
    public int numero = 0;
    
    public void imprime() {
        System.out.println(contador);
    }
    
    public static void testa() {
        System.out.println("metodo statico");
    }
}
