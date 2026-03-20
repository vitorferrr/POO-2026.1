package estudoProva;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getNome() {
        return super.getNome();
    }

    public double getSalario() {
        return super.getSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setSalario(double salario) {
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    public double calcularBonusGerente(){
        return getSalario() * 0.2;
    }
}
