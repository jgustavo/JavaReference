package threads;
class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Thread atual: " + t);
        t.setName("Minha Thread");
        System.out.println("Depois da mudan�a de nome: " + t);
        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000*n);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrup��o da thread principal");
        }
        System.out.println("Fim da execu��o");
    }
    
}