
public class LiteralsSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 0xFF;
	// A linha abaixo est� errada	
	//	int c = 1f; 
		
		float c = 1f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double d = 3.1416e26;
		System.out.println(d);
		System.out.printf( "%.2f", d );  
		
		
		char e = 'e';
//      A linha abaixo n�o vai compilar		
//		char e = "e";
//      Nem esta
//		char f = "isto � uma string";
		
		String f = "isto � uma \n string";
		
		System.out.println(e);
		System.out.println(f);

	}

}
