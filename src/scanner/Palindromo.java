package scanner;

import java.util.Scanner;

public class Palindromo {
    
    static Scanner scanner = new Scanner(System.in);
    static String resposta;
    
    public static void main (String[] args) {
        System.out.println("Digite a palavra:");
        resposta = scanner.nextLine();
        System.out.println(resposta);
        String palavraInvertida = "";
        for (int i = resposta.length(); i > 0 ; i--) {
            palavraInvertida = palavraInvertida + resposta.charAt(i-1);
        }
        System.out.println(palavraInvertida);
    }
}
