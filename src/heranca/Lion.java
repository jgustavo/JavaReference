package heranca;

public class Lion extends Feline{
    Lion() {
       System.out.println("lion");
    }
    public static void main (String [] args) {
        Lion l = new Lion();
        l.setType("lion");
    }
}
