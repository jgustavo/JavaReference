package threads;

public class TesteProcuraPrimosThread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ProcuraPrimosThread t1 = new ProcuraPrimosThread(1, 25000);
        ProcuraPrimosThread t2 = new ProcuraPrimosThread(25001, 50000);
        ProcuraPrimosThread t3 = new ProcuraPrimosThread(50001, 75000);
        ProcuraPrimosThread t4 = new ProcuraPrimosThread(75001, 100000);
        long tempoInicial = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            //System.out.println(t1.qtd);
            System.out.println(t1.qtd+t2.qtd+t3.qtd+t4.qtd);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        long tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial);
        

    }

}
