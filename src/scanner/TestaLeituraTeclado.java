package scanner;

import java.util.Scanner;

public class TestaLeituraTeclado {
    
    static Scanner scanner = new Scanner(System.in);
    static String resposta;
    
    public static void main (String[] args) {
        System.out.println("Qual � o seu nome?");
        resposta = scanner.nextLine();
        System.out.print("Ol� ");
        System.out.println(resposta);
        System.out.println("A primeira letra do seu nome �: " + resposta.charAt(0));
        String[] array = resposta.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].charAt(0));
        }
    }
}
