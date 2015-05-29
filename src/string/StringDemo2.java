package string;

class StringDemo2 {
	public static void main(String args[]) {
		String string1 = new String("Uma String Qualquer");
		String string2 = new String("Uma String Qualquer");
		String string3 = string1;
		System.out.println("Tamanho da string1: " +	string1.length());
		System.out.println("Char na posicao 1 na string1: " + string1.charAt(1));
		if(string1 == string2)
			System.out.println("string1 == string2");
		else
			System.out.println("string1 != string2");
		
		if(string1 == string3)
			System.out.println("string1 == string3");
		else
			System.out.println("string1 != string3");
	}
}