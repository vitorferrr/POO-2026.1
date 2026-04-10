package a8.exe1;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    public void aumentaSalario() {
        System.out.println(getSalario()*1.1);
    }
}
