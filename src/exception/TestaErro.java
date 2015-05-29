package exception;

public class TestaErro {

    /**
     * @param args
     */
    public static void main(String[] args) {

        for (int i = -5;i<5;i++) {
            try {
                System.out.println(10/i);
            } catch (Exception e) {
                System.out.println("Divisão por zero");
            }

        }

    }

}
