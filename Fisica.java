public class Fisica extends Pessoa {

    private Long nascimento;
    private String ecivil;
    private Long CPF;

    public Fisica(String nome, String email, String endereco, Long nascimento, Long CPF) {
        super(nome, email, endereco);
        this.nascimento = nascimento;
        this.CPF = CPF;
    }
    public Fisica(String nome, String email, String endereco, String ecivil) {
        super(nome, email, endereco); 
        this.ecivil = ecivil;
    }
}
