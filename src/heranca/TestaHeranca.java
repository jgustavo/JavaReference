package heranca;

public class TestaHeranca {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        
        pf.setNome("Rodolfo");
        pf.setEndereco("Rua 1");
        pf.setTelefone("1234");
        pf.setCpf("1234567890");
        
        // faz um monte de coisa
        
        System.out.println(pf.getNome());
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Dono da Empresa");
        pj.setEndereco("Rua 14");
        pj.setTelefone("5678");
        pj.setRazaoSocial("Comercial de Alimentos");
        pj.setCnpj("09999999");
        
        //faz um monte de coisa
        
        System.out.println(pj.getNome());
        
  
        
    }

}
