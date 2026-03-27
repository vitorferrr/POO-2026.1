package a8;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public double getSalario() {
        return super.getSalario();
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    public void aumentaSalario() {
        System.out.println(getSalario()*0.1);
    }
}
