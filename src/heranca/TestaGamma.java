package heranca;

public class TestaGamma {
    
    public static String imprime(Alpha a) {
        return a.getType();
        
    }
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta g1 = new Beta();
        Gamma g2 = new Gamma();
       System.out.println(g1.getType() + " "
                    + g2.getType());
       
       System.out.println(TestaGamma.imprime(g2));

    }

}
