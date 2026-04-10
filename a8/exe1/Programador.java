package a8.exe1;

public class Programador extends Funcionario{

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    public void aumentaSalario() {
        System.out.println(getSalario()*1.2);
    }
}
