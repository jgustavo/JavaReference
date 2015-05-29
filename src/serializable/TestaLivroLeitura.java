package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLivroLeitura {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream oi =                                             
                new ObjectInputStream(new FileInputStream("Livros.arq"));
        
        List<Livro> livros = (List<Livro>)oi.readObject();
        
        for(Livro l:livros) {
           System.out.println(l);
        }

    }

}
