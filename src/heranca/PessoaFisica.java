package heranca;

public class PessoaFisica extends Pessoa implements Conta {
	public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;

    @Override
    public void geraAuditoria() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saca() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deposita() {
        // TODO Auto-generated method stub
        
    }
        


}
