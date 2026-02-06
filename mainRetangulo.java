public class mainRetangulo {
    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        r1.lado1 = 5;
        r1.lado2 = 6;

        r2.lado1 = 3;
        r2.lado2 = 3;

        System.out.println(r1.area());
        System.out.println(r1.perimetro());

        System.out.println(r2.area());
        System.out.println(r2.perimetro());
    }
}
