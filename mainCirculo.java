public class mainCirculo {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();


        c1.raio = 3;
        c2.raio = 2;
        System.out.println(c1.raio);
        System.out.println(c1.area());
    }
}
