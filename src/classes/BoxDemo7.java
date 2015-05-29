package classes;
class BoxDemo7 {
	public static void main(String args[]) {
		// declare, allocate, and initialize Box objects
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		double vol;
		// get volume of first box
		mybox1.setCor(Box.AZUL);
		
		vol = mybox1.volume();
		System.out.println("O volume � " + vol);
		System.out.println("A cor �:" + mybox1.getDescCor());
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}