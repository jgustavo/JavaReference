package object;

public class TestaObject  {
    public static void main(String[] args) {
        int a[] = { 1,2,3,4};
          System.out.print(a instanceof Object);
    }
}

//A. Will produce output as false.
//B. Compilation fails due to error at line 3.
//C. Will produce output as true.
//D. Compilation fails due to error at line 4.
//E. Length of this array is 3.