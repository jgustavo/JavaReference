package heranca;

//A simple example of inheritance.
//Create a superclass.
class A {
    
    int i, j;
    
    A() {
    i = 0;
    j = 0;    
    }
	
	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
	
	void show() {
		System.out.println("Este m�todo � da superclasse");
	}
	
	public final void metodoFinal() {
		System.out.println("este � um m�todo final");
	}
}