package sobrecarga;

class Overload {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		// call all versions of test()
		ob.test(1,2);
	//	ob.test(10f);
	//	ob.test(10, 20);
	//	result = ob.test(123.25);
	//	System.out.println("Result of ob.test(123.25): " + result);
	}
}