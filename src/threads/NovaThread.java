package threads;

class NovaThread implements Runnable {
    Thread t;
    NovaThread() {
        t = new Thread(this, "Thread Demo");
        System.out.println("Thread filha: " + t);
        t.start();
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Thread filha: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread filha interrompida.");
        }
        System.out.println("Saindo da thread filha.");
    }
}
