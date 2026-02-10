package exe1;

public class mainQuadrado {
    public static void main(String[] args) {
        
        quadrado q1 = new quadrado(5);

        System.out.println("CLasse quadrado:");
        System.out.println("A área do quadrado é: " + q1.area());
        System.out.println("O perímetro do quadrado é: " + q1.perimetro());
        System.out.println(q1.texto());
        System.out.println();
        q1.desenho();

    }
}
