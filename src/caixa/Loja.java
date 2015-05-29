package caixa;

public class Loja {
    
    public double calculaPreco(Object o) {
        return 200;
    }
    
    public void log(Object o) {
        System.out.println(o.toString());
    }

    public static void main(String[] args) throws CaixaException {
       Caixa c = new Caixa(10,10,10);
       Caixa c2 = new Caixa(10,10,10);
       Sapato s = new Sapato();
       Loja l = new Loja();
       String s1 = new String("a");
       String s2 = new String("a");
       
       if (c.equals(c2)) {
           System.out.println("S�o Iguais");
       } else
           System.out.println("N�O S�o Iguais");
       
       Object o = new Object();
       
       
       l.log(s);
       l.log(c);
       l.log(s1);
    }

}
