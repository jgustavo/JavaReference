package heranca;

public class TestaInterface {
    public static void main(String[] args) {
        Conta c;
        c = new PessoaFisica();
        c.deposita();
        c.saca();
    }
}
