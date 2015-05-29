package classes;
class BoxDemo5 {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = mybox2;
		mybox1 = mybox2;
		double vol;
		// initialize each box
		mybox1.setDim(10, 20, 15);
		System.out.println(mybox1.getDescCor());
		mybox1.setCor(Box.AMARELO);
		System.out.println(mybox1.getDescCor());
		
		mybox2.setDim(10, 20, 15);
		mybox2.setCor(Box.AMARELO);
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		
		System.out.println(mybox1.toString());
		
		if (mybox3 == mybox2) {
		    System.out.println("as caixas s�o iguais");
		}
		
		
	}
}