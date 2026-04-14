package a10;

import java.util.Scanner;

public class testeTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o dividendo:");
        int dividendo = sc.nextInt();
        System.out.println("Insira o divisor:");
        int divisor = sc.nextInt();

        try {
            divide(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por 0");
        }
        System.out.println("Continuando código");
    }

    public static void divide(int dividendo, int divisor) /* throws ArithmeticException */{
        System.out.println("Divisão = " + (dividendo/divisor));
    }
    
}

/* Pode tanto ser colocado direto na função quanto no try-catch */
