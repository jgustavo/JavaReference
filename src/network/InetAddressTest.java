package network;

import java.io.IOException;
//Demonstrate InetAddress.
import java.net.*;
class InetAddressTest
{
    public static void main(String args[]) throws IOException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("venturus.org.br");
        System.out.println(address);
        
        address = InetAddress.getByAddress(new byte[] {(byte)193,101,(byte)144,113});
        System.out.println(address);
        System.out.println(address.isReachable(1000));
        
        InetAddress SW[] = InetAddress.getAllByName("www.google.com");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);
    }
}