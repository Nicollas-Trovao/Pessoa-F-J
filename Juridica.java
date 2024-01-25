public class Juridica {

    private String CNPJ;
    private Long investimento;
    private String socio;

    public Juridica(String CNPJ, String socio){
        this.CNPJ = CNPJ;
        this.socio = socio;
    }
    public Juridica(Long investimento){
        this.investimento = investimento;
    }
    
}
