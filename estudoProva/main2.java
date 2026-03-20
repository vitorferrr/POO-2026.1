package estudoProva;

import java.util.ArrayList;

public class main2 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario g = new Gerente("fulano", 1000, "vendas");
        Funcionario d1 = new Desenvolvedor("Cicravo", 2000, "java");
        Funcionario d2 = new Desenvolvedor("cleber", 3000, "C++");

        funcionarios.add(g);
        funcionarios.add(d1);
        funcionarios.add(d2);

        imprimeFuncs(funcionarios);
    }

    public static void imprimeFuncs(ArrayList<Funcionario> f){
/*         for (int i = 0; i < f.size(); i++) {
            System.out.println("nome: " + f.get(i).getNome());
            System.out.println("salario: " + f.get(i).getSalario());

            if (f.get(i) instanceof Gerente) {
                System.out.println("bonus: " + ((Gerente)f.get(i)).calcularBonusGerente());
            } else if (f.get(i) instanceof Desenvolvedor) {
                System.out.println("bonus: " + ((Desenvolvedor)f.get(i)).calcularBonusDesenvolvedor());
            } else {
                System.out.println("bonus: " + (f.get(i)).calcularBonus());
            }
            System.out.println("==============");
        } */

            for (Funcionario funcionario : f) {
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("salario: " + funcionario.getSalario());

            if (funcionario instanceof Gerente) {
                System.out.println("bonus: " + ((Gerente)funcionario).calcularBonusGerente());
            } else if (funcionario instanceof Desenvolvedor) {
                System.out.println("bonus: " + ((Desenvolvedor)funcionario).calcularBonusDesenvolvedor());
            } else {
                System.out.println("bonus: " + (funcionario).calcularBonus());
            }
            System.out.println("================");
            }
    }
}
