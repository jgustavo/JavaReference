package threads;

public class NovaThreadHeranca
extends Thread {
    NovaThreadHeranca() {
        super("Demo Thread");
        System.out.println("Thread filha: " + this);
        start(); 
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Thread Filha: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Filha interrompida.");
        }
        System.out.println("Sainda da thread filha.");
    }
}