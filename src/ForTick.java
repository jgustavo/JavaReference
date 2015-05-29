// Demonstrate the for loop.
class ForTick {
	public static void main(String args[]) {
		int n;
		for(n=10; n>0; n--)
			System.out.println("tick " + n);
		
		int a, b;
		for(a=1, b=4; a<b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);	
		}
	}
}