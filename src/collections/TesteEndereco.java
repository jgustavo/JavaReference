package collections;

import java.util.ArrayList;

public class TesteEndereco {

    public static void main(String[] args) {
        
        Endereco e1 = new Endereco();
        e1.setNome("Jose");
        e1.setRua("Rua 1");
        e1.setCidade("Indaiatuba");
        e1.setEstado("SP");
        e1.setCep("12345");
        
        Endereco e2 = new Endereco();
        e2.setNome("Joao");
        e2.setRua("Rua 2");
        e2.setCidade("Indaiatuba");
        e2.setEstado("SP");
        e2.setCep("44444");
        
        ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();
        
        listaEndereco.add(e1);
        listaEndereco.add(e2);

        for (Endereco endereco : listaEndereco) {
            System.out.println(endereco);
        }
        

    }

}
