import java.util.Scanner;

public class mainRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo r1 = new Retangulo();
        /* Retangulo r2 = new Retangulo(); */

        System.out.println("Insira o primeiro lado do retangulo:");
        r1.lado1 = sc.nextDouble();
        System.out.println("Insira o segundo lado do retangulo:");
        r1.lado2 = sc.nextDouble();

        /* r2.lado1 = 3;
        r2.lado2 = 3; */

        System.out.println("A área desse retângulo é " + r1.area());
        System.out.println("O perímetro desse retângulo é " + r1.perimetro());

        /* System.out.println(r2.area());
        System.out.println(r2.perimetro()); */

        sc.close();
    }
}
