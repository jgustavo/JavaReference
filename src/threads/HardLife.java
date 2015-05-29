package threads;

public class HardLife implements Runnable {
    static protected String mensagem;
    public void run() {
        try {
            Thread.sleep(2000);
            mensagem = "A vida eh dura";
        }
        catch (InterruptedException e) {
        }
    }
}