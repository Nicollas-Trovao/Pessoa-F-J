public class Juridica extends Pessoa {

    private String CNPJ;
    private Long investimento;
    private String socio;

    public Juridica(String nome, String email, String endereco, String CNPJ, String socio){
        super(nome, email, endereco);
        this.CNPJ = CNPJ;
        this.socio = socio;
    }
    public Juridica(String nome, String email, String endereco, Long investimento){
        super(nome, email, endereco);
        this.investimento = investimento;
    }
    
}
