
public class ProcuraPrimos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float result = 0;
		int qtd = 0;
		long tempoInicial = System.currentTimeMillis();
		for (int i=1;i<100000;i++) {
			for (int j=2;j<=i;j++) {
				
				result = i/j;
				
				if (i % j == 0 && result == 1) {
	//				System.out.println(i + "%" + j +"=" + i%j +" , "+ result );
					System.out.println(i + " é primo!");
					qtd++;
					break;					
				}				
				
				if (i % j == 0 && result != 0) {
		//			System.out.println(i + " não é primo!");
					break;
					
				}
				

			}	
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.println(tempoFinal - tempoInicial);
		System.out.println("Existem " + qtd + " numeros primos");

	}

}
