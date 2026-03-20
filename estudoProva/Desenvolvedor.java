package estudoProva;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getNome() {
        return super.getNome();
    }

    public double getSalario() {
        return super.getSalario();
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }


    public double calcularBonusDesenvolvedor(){
        return getSalario() * 0.15;
    }
}
