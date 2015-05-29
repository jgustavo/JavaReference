
public class CalculaEuler {


	public static long fatorial(long n) {
		if (n==0)
			return 1;
		else
			return n*fatorial(n-1);

	}

	public static void main(String[] args) {

		double euler = 0;
		for (int i=0;i <= 20; i++) {
			long x = fatorial(i);
			System.out.println(i + " "+ x);
			euler += 1D/x;
		}
		System.out.println(euler);
	}

}
