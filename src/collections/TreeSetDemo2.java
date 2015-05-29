package collections;
// Demonstrate TreeSet.
import java.util.*;
class TreeSetDemo2 {
    public static void main(String args[]) {
        // Create a tree set.
        HashSet<String> ts = new HashSet<String>();
        // Add elements to the tree set.
        ts.add("C");
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}