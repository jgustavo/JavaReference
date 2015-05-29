package heranca;

public class SimpleOverride {
	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();
		superOb.show();
		subOb.show();
	}
}
