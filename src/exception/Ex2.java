package exception;

public class Ex2 {

	public static void main (String[] args){

		int[] i = new int[5];

		try 
		{ 
			i[5] = 10;
			System.out.println(i[5]);
		} 
		catch (Exception e) 
		{
			System.out.println("Indice do Array Fora do Limite"); 
		} 
		System.out.println("Fim do programa");
	}

}
