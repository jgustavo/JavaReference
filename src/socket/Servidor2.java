package socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor2 {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        Socket cliente = servidor.accept();
        System.out.println("Nova conexao com o cliente " +
                cliente.getInetAddress().getHostAddress()
                );

        Scanner entrada = new Scanner(cliente.getInputStream());
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
            saida.println("Temp");
        }

        entrada.close();
        saida.close();
        servidor.close();
        cliente.close();
    }
}