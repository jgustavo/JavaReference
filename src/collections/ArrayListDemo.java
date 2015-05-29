package collections;
// Demonstrate ArrayList.
import java.util.*;
class ArrayListDemo {
    public static void main(String args[]) {
        // Create an array list.
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " +  al.size());
        // Add elements to the array list.
        al.add("Gol");
        al.add("Clio");
        al.add("Fiesta");
        al.add("Celta");
        al.add("Sandero");
        al.add("Etios");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " +
                al.size());
        // Display the array list.
        for (String s:al  ){
            System.out.println(s);
           // s = "aaa";
        }
        System.out.println("Contents of al: " + al);
        // Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " +
                al.size());
        System.out.println("Contents of al: " + al);
    }
}