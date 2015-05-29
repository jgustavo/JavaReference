
public class SomaNumeros {

	public static void main(String args[]) {
		int acumula = 0;
		for (int i=1;i<=100;i++) {
			acumula += i;
			System.out.println(i + ": " + acumula);
		}
	}
}
