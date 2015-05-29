package serializable;

import java.io.Serializable;

public class Livro implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -7668737721104215086L;
    
    public String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String autor;
   
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" + "Autor: " + getAutor();
    }

}
