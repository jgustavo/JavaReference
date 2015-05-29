package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestaLivro {
    public static void main(String [] args) throws FileNotFoundException, IOException {
        
        ObjectOutputStream oo = 
                new ObjectOutputStream(new FileOutputStream("Livros.arq"));
        
        Livro l1 = new Livro();
        l1.setNome("O Pequeno Principe");
        l1.setAutor("Autor 1");
        
        Livro l2 = new Livro();
        l2.setNome("Harry Potter");
        l2.setAutor("Uma Mulher");
        
        ArrayList<Livro> livros = new ArrayList<Livro>();
        
        livros.add(l1);
        livros.add(l2);
        
        for (Livro l:livros) {
            System.out.println(l.getNome());
        }
        oo.writeObject(livros);
        oo.close();
    }
}
