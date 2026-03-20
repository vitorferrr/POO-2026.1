package estudoProva;

import java.util.UUID;

public class Funcionario {
    private String nome;
    private double salario;
    private static int totalFuncionarios = 0;
    private final String id;


    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.id = UUID.randomUUID().toString();
        totalFuncionarios++;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void setTotalFuncionarios(int totalFuncionarios) {
        Funcionario.totalFuncionarios = totalFuncionarios;
    }
    

    public double calcularBonus() {
        return this.salario * 0.1;
    }
}
