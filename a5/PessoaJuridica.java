package a5;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj){
        super(nome, idade);
        this.cnpj = cnpj;
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
