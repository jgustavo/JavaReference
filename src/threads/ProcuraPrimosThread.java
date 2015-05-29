package threads;

public class ProcuraPrimosThread extends Thread {

    int inicio = 0;
    int fim = 0;
    public int qtd =0;

    ProcuraPrimosThread(int inicio, int fim) {
        super();
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run() {
        procura(inicio,fim);
    }

    public int procura(int inicio, int fim) {
        float result = 0;
        qtd = 0;
        for (int i=inicio;i<fim;i++) {
            for (int j=2;j<=i;j++) {
                result = i/j;
                if (i % j == 0 && result == 1) {
                    System.out.println(i + " é primo!");
                    qtd++;
                    break;                  
                }               
                if (i % j == 0 && result != 0) {
                    break;
                }
            }   
        }
        return qtd;
    }

    /**
     * @param args
     */

}
