package threads;

class NewThread implements Runnable {
    String nome; 
    Thread t;
    NewThread(String threadname) {
        nome = threadname;
        t = new Thread(this, nome);
        System.out.println("Nova Thread: " + t);
        t.start(); 
    }

    public void run() {
        try {
            for(int i = 3; i > 0; i--) {
                System.out.println(nome + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(nome + "Interrupted");
        }
        System.out.println(nome + " saindo...");
    }
}
