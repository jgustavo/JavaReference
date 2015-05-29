package string;

public class TesteString2 {
	public static void main(String[] args) {
		String teste = "minha string";
		System.out.println(teste.charAt(1));
		String texto = "Joao ,Jose ,Maria ,Pedro , Ester ";
		String [] cursos = texto . split (",");
		for (String s:cursos) {
			System.out.println(s.trim());
		}
	}
}
