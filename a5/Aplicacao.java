package a5;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome, info;
        int idade;

        nome = sc.next();
        idade = sc.nextInt();
        info = sc.next();

        PessoaFisica pf = new PessoaFisica(nome, idade, info);
        imprime(pf);

        nome = sc.next();
        idade = sc.nextInt();
        info = sc.next();

        PessoaJuridica pj = new PessoaJuridica(nome, idade, info);
        imprime(pj);

        sc.close();
    }

    public static void imprime(Pessoa p){
        System.out.println("Nome da Pessoa: " + p.getNome());
        System.out.println("Idade da Pessoa: " + p.getIdade());
        
        if (p instanceof PessoaFisica) {
            System.out.println("CPF da Pessoa: " + ((PessoaFisica) p).getCpf());
        } else if (p instanceof PessoaJuridica) {
            System.out.println("CNPJ da Pessoa: " + ((PessoaJuridica) p).getCnpj());
        }
    }
}