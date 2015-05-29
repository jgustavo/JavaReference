package caixa;


/**
 * @author Jose Gustavo Neves (jose.neves@venturus.org.br)
 * @created &(date)
 * 
 */
/**
 * @author Jose Gustavo Neves (jose.neves@venturus.org.br)
 * @created &(date)
 * 
 */
public class Caixa {
	
	double altura;
	double largura;
	double profundidade;
	
	Caixa() {
		System.out.println("Construtor sem parametros");
	}
	
	/**
	 *  Este m�todo � um construtor de caixas
	 * 
	 * @param Altura da Caixa
	 * @param Largura da Caixa
	 * @param Profundidade da Caixa
	 * @throws CaixaException 
	 */
	Caixa(double altura, double largura, double profundidade) throws CaixaException {
		System.out.println("Construtor!!!!");
		if (altura < 0)
		    throw new CaixaException();
		    
		this.altura = altura;
		this.largura = largura;
		// testeasfas 
		this.profundidade = profundidade;
	}
	
	void ajustaDimensao(double altura, double largura, double profundidade) {
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}
	
	/**
	 * 
	 * @return Retorna o Volume da Caixa
	 */
	double calculaVolume() {
		return altura * largura * profundidade;
	}
	
    void imprimeVolume () {
		System.out.println(calculaVolume());
	}
    @Override
    public String toString() {
        return "Minha Caixa";
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        Caixa c2 = (Caixa) obj;
//         
//        if (this.altura == c2.altura && this.largura == c2.largura && c2.profundidade == this.profundidade)
//            return true;
//        else        
//            return false;
//    }

}
