package a4.exe4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o nome do seu departamento: ");
        String nomeDepart = sc.nextLine();
        System.out.println("Insira o código do seu departamento: ");
        int codigoDepart = sc.nextInt();
        sc.nextLine();

        Depart departamento = new Depart(codigoDepart, nomeDepart);

        System.out.println("Insira o seu nome: ");
        String nomeFunc = sc.next();
        System.out.println("Insira o seu código de matrícula: ");
        int codigoFunc = sc.nextInt();

        Funcionario func = new Funcionario(codigoFunc, nomeFunc, departamento);
    


        System.out.println(func);

        func.setMatricula(567);

        System.out.println(func);

        sc.close();
    }
}
