package heranca;

//Create a subclass by extending class A.
class B extends A {
	int k;
	
	B() {
	    super();
	    k =0;
	}
	void showk() {
		System.out.println("k: " + k);
	}
	void sum() {
		System.out.println("i+j+k: " + (i+j+k));
	}
	
	void show() {
		System.out.println("Este m�todo � da subclasse");
	}
}
