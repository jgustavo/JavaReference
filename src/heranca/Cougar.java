package heranca;

public class Cougar extends Feline {
    public Cougar() {
        System.out.print("cougar "); 
    }
    void go() {
        setType("cougar");
        System.out.print(getType());
    }
    
    public static void main(String[] args) {
        new Cougar().go();
    }
    
}
