package LISTAS.exeHerança;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

/*         Funcionario x = new Desenvolvedor("Vitor", 15000, "Java");
        Funcionario y = new Gerente("L7", 25000, "Produção");
        Funcionario z = new Funcionario("Jonas", 1000);

        imprimeFuncionario(z); */
        
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario a = new Gerente("Vitor", 12000, "Vendas");
        Funcionario b = new Desenvolvedor("Ferreira", 15000, "JAVA");
        Funcionario c = new Desenvolvedor("Santos", 11200, "C#");

        funcionarios.add(a);
        funcionarios.add(b);
        funcionarios.add(c);

        imprimeFuncs(funcionarios);
    }

/*     public static void imprimeFuncionario(Funcionario f) {
        System.out.println("Nome:" + f.getNome());
        System.out.println("Salario: " + f.getSalario());

        if (f instanceof Gerente) {
            System.out.println("Departamento: " + ((Gerente)f).getDepartamento());
            System.out.println("Bônus: " + ((Gerente)f).calcularBonusGerente());
        } else if (f instanceof Desenvolvedor) {
            System.out.println("Linguagem: " + ((Desenvolvedor)f).getLingugagem());
            System.out.println("Bônus: " + ((Desenvolvedor)f).calcularBonusDesenvolvedor());
        } else {
            System.out.println("Bônus: " + f.calcularBonus());
        }
    }
 */

    public static void imprimeFuncs(ArrayList<Funcionario> f){
        for (int i = 0; i < f.size(); i++) {
            System.out.println("Nome: " + f.get(i).getNome());
            System.out.println("Salário: " + f.get(i).getSalario());
            
            if (f.get(i) instanceof Gerente) {
                System.out.println("Departamento: " + ((Gerente)f.get(i)).getDepartamento());
                System.out.println("Bônus: " + ((Gerente)f.get(i)).calcularBonusGerente());
            } else if (f.get(i) instanceof Desenvolvedor) {
                System.out.println("Linguagem: " + ((Desenvolvedor)f.get(i)).getLingugagem());
                System.out.println("Bônus: " + ((Desenvolvedor)f.get(i)).calcularBonusDesenvolvedor());
            } else {
                System.out.println("Bônus: " + f.get(i).calcularBonus());
            }

            System.out.println("===============================");
        }
    }
}


