package socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente2 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket cliente = new Socket("127.0.0.1", 12345);
        System.out.println("O cliente se conectou ao servidor!");

        Scanner entrada = new Scanner(cliente.getInputStream());
        PrintStream saida = new PrintStream(cliente.getOutputStream());

        saida.println("client");
        
        while (entrada.hasNextLine()) {
        	System.out.println(entrada.nextLine());
        }
        
        saida.close();
        entrada.close();
        cliente.close();
        System.out.println("Saiu");
    }
}