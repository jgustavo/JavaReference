import java.io.ObjectInputStream.GetField;


public class TestaStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Caixa c1 = new Caixa();
	    c1.imprime();
	    Caixa c2 = new Caixa();
	    c2.imprime();
	    Caixa c3 = new Caixa();
	    c3.imprime();
	    Caixa c4 = new Caixa();
	    c4.imprime();
	    Caixa c5 = new Caixa();
	    c5.imprime();
	    Caixa c6 = new Caixa();
	    c6.imprime();
	    
	    c1.contador = 9;
	    c1.imprime();
	    c6.imprime();
	    
	    Caixa.testa();
	    
	 //   Caixa.imprime();
	    
	//    System.out.println(c1.contador);
		

	}

}
