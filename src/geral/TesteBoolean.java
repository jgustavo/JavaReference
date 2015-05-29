
package geral;

public class TesteBoolean {
    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;
        if (v)
            System.out.println("O boolean pode ser usado para estruturas condicionais");

        if (f)
            System.out.println("Esta linha nunca vai ser escrita");
        
        boolean resultado = f || v;
        System.out.println(resultado);
    }
}
