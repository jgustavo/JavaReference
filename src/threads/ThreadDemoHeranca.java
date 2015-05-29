package threads;

public class ThreadDemoHeranca {
    public static void main(String args[]) {
        new NovaThreadHeranca(); 
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Thread Principal: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread principal interrompida.");
        }
        System.out.println("Saindo da thread principal.");
    }
}