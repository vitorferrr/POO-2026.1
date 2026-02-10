public class Retangulo {
    double lado1;
    double lado2;

    Retangulo(double l1, double l2) {
        lado1 = l1;
        lado2 = l2;
    }

    Retangulo() {
        lado1 = 0;
        lado2 = 0;
    }

    double area(){
        return lado1*lado2;
    }

    double perimetro() {
        return 2*lado1 + 2*lado2;
    }
}
