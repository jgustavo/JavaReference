package network;

//Demonstrate Sockets.
import java.net.*;
import java.util.Properties;
import java.io.*;
class Whois {
    public static void main(String args[]) throws Exception {
    	
		Properties sysProps = System.getProperties();
		//sysProps.put("proxySet", "true");
	//	sysProps.put("proxyHost", "brcpsprx02");
	//	sysProps.put("proxyPort", "8080");
		
        int c;
        //Create a socket connected to internic.net, port 43.
        Socket s = new Socket("whois.registro.br", 43);
        //Obtain input and output streams.
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        //Construct a request string.
        String str = (args.length == 0 ? "venturus.org.br" : args[0]) + "\n";
        //Convert to bytes.
        byte buf[] = str.getBytes();
        //Send request.
        out.write(buf);
        //Read and display response.
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
