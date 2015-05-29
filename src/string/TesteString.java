package string;

public class TesteString {
    public static void main(String[] args) {
        String s = "Centro Universitário Nossa Senhora do Patrocínio";
        s = s.replace('á', 'a');
        System.out.println(s);
        String[] s2 = s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i].charAt(0));
        }
        
        String s4 = "  Meu nome é Joao  ";
        
        s4 = s4.trim();
        
        System.out.println(s4);
       
    }
}