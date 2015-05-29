package threads;

public class TesteHardLife extends HardLife {

    public static void main(String[] args) throws InterruptedException {
        mensagem = "A vida eh bela";
        Thread t = new Thread(new HardLife());
        t.start();
        Thread.sleep(1000);
        System.out.println(mensagem);
    }

}
