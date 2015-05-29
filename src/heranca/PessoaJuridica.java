package heranca;

public class PessoaJuridica extends Pessoa implements Conta {

    String cnpj;
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    String razaoSocial;

    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNome() {
        return razaoSocial;
    }
    @Override
    public void saca() {
        System.out.println("SACOU PESSOA JURIDICA");
    }
    @Override
    public void deposita() {
        System.out.println("DEPOSITOU PESSOA JURIDICA");        
    }
    @Override
    public void geraAuditoria() {
        System.out.println("PESSOA JURIDICA AUDITADA");

    }


}
