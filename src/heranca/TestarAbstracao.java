package heranca;

public class TestarAbstracao {
	public static void main(String[] args) {
		// A linha abaixo est� errada
		// Uma classe abstrata n�o pode ser instanciada
//		Carro c = new Carro();  
		Fusca f = new Fusca();
		f.ligar();
		f.virarDireita();
	}
}
