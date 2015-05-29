package io;

import java.io.IOException;
import java.io.InputStream;

public class TesteInputStream {
    public static void main(String[] args) throws IOException {
        InputStream entrada = System.in;
        int i=0 ;
        do {
            i = entrada.read();
            System . out . println (" valor lido : " + i);
        } while (i != -1);
    }
}
