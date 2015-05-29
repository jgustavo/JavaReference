package collections;

import java.util.*;
class ArrayListDemo2 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Gol");
        al.add("Clio");
        al.add("Fiesta");
        al.add("Celta");
        al.add("Sandero");
        al.add("Etios");
        System.out.println(al.get(1));
        if (al.contains("Gol")) {
        	al.remove("Gol");
        }
        System.out.println(al.get(1));        
    }
}