package loops;

public class TestaLoop
{
    public static void main(String [] args) 
    {
        int x = 10;
        for (int y=0; y<5; y++, x--)
            System.out.print(x + ", ");
    }
}