package collections;

import java.util.TreeSet;

public class ContaPalavras {
    public static void main(String[] args) {
        String s = "o rato roeu a roupa do rei de roma";
        String palavras[] = s.split(" ");
        TreeSet<String> ts = new TreeSet<String>();
        for(String palavra:palavras)
            ts.add(palavra);
        System.out.println(ts);
    }
}
