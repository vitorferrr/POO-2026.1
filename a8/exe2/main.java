package a8.exe2;

public class main {
    public static void main(String[] args) {
     
        FormaGeometrica c1 = new Circulo(3);
        FormaGeometrica q1 = new Quadrado(5);

        System.out.println(c1.CalculaArea());
        System.out.println(c1.CalculaComprimento());
        System.out.println(q1.CalculaArea());
        System.out.println(q1.CalculaComprimento());

    }


}
