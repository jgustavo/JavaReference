package network;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Properties;

public class Ping {
  public static void main(String[] argv) throws Exception {
      
    Socket t = new Socket("venturus.org.br", 7);
    DataInputStream dis = new DataInputStream(t.getInputStream());
    PrintStream ps = new PrintStream(t.getOutputStream());
    ps.println("Hello");
    String str = dis.readUTF();
    if (str.equals("Hello"))
      System.out.println("Alive!");
    else
      System.out.println("Dead");
    t.close();
  }
}
