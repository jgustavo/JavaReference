package caixa;

public class CaixaDemo {

	public static void main(String[] args) {

		Caixa minhaCaixa;

            try {
                minhaCaixa = new Caixa(20, 20, 20);
                System.out.println(minhaCaixa.calculaVolume() * 0.25);
                minhaCaixa = null;
                minhaCaixa.imprimeVolume();
                minhaCaixa.calculaVolume();

            } catch (CaixaException e) {
                // TODO Auto-generated catch block
             //   e.printStackTrace();
            } finally {
                System.out.println("Linha do Finally");
            }

		
	}

}
