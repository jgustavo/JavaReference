package array;

public class Array2 {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[1] = new int[]{1,2,3};
        a[2] = new int[]{4,5};
        System.out.print(a[1][1]);
    }
}


//A. Compilation fails due to line 3.
//B. Compilation fails due to line 4.
//C. An exception will be thrown in runtime.
//D. 2
//E. 3
//F. 5
