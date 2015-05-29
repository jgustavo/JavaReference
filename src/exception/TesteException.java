package exception;

public class TesteException {

    public static void main(String[] args) {
        try {
            try {
                int d = 0;
            } catch (Exception e) {
                // TODO: handle exception
            }
      //      int x = 655/d;
            String n = null;
            n.charAt(0);
      //      System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
            System.out.println(e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro generico");
            e.printStackTrace();
        }

    }

}
