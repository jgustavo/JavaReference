package socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        Properties sysProps = System.getProperties();
        sysProps.put("proxySet", "true");
        sysProps.put("proxyHost", "brcpsprx02");
        sysProps.put("proxyPort", "8080");
        
        String ipAddress = "127.0.0.1";
        InetAddress inet = InetAddress.getByName(ipAddress);

        System.out.println("Sending Ping Request to " + ipAddress);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
        
        ipAddress = "193.101.144.113";
        inet = InetAddress.getByName(ipAddress);

        System.out.println("Sending Ping Request to " + ipAddress);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
        
        ipAddress = "173.194.118.19";
        inet = InetAddress.getByName(ipAddress);

        System.out.println("Sending Ping Request to " + ipAddress);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");


        ipAddress = "193.101.147.244";
        inet = InetAddress.getByName(ipAddress);

        System.out.println("Sending Ping Request to " + ipAddress);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
        

        inet = InetAddress.getByAddress(new byte[] { 127, 0, 0, 1 });
        System.out.println("Sending Ping Request to " + inet);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");

        inet = InetAddress.getByAddress(new byte[] { (byte) 173, (byte) 194, 32, 38 });
        System.out.println("Sending Ping Request to " + inet);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");

        
        
        
        Socket cliente = new Socket("193.101.147.244", 7);
        System.out.println("O cliente se conectou ao servidor!");

        Scanner teclado = new Scanner(System.in);
        PrintStream saida = new PrintStream(cliente.getOutputStream());

        while (teclado.hasNextLine()) {
            saida.println(teclado.nextLine());
        }

        saida.close();
        teclado.close();
        cliente.close();
        
        
        
        
    }
}