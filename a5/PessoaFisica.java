package a5;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, int idade, String cpf){
        super(nome, idade);
        this.cpf = cpf;
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
