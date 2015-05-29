package classes;
// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
	    Box box1 = new Box(10,20,15);
	    Box box2 = new Box(3,6,9);
	    box1.setCor(Box.AZUL);
	    box2.setCor(Box.VERMELHO);
	    System.out.println("O volume �: " + box1.volume() + " e a cor � " + box1.getDescCor());
	    System.out.println(box2.volume() + box2.getDescCor());
	}
}