package classes;
/* A program that uses the Box class.
 */
class Box {
	private double width;
	private double height;
	private double depth;
	private int cor = 1;
	private String[] descCor= {"AMARELO","AZUL","VERMELHO"};
	public static final int AMARELO = 0;
	public static final int AZUL = 1;
	public static final int VERMELHO = 2;

	Box() {
		width = 10;
		height = 10;
		depth = 10;
		System.out.println("Passou pelo construtor");
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		System.out.println("Passou pelo construtor com parametro");
	}	

	// display volume of a box
	double volume() {
		return width * height * depth;
	}
	// sets dimensions of box
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	
	public String getDescCor() {
	    return descCor[cor];
	}
	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}
	
	public String toString() {
	    return "volume: " + Double.toString(volume());
	}
	
	public boolean equals(Object o) {
	    Box box = (Box) o;
	    if (box.volume() == volume() && box.getCor() == getCor())
	        return true;
	    else
	        return false;
	    
	}
}