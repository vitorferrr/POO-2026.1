public class Retangulo {
    double altura;
    double base;

    Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    Retangulo() {
        this.altura = 0;
        this.base = 0;
    }

    double area(){
        return altura*base;
    }

    double perimetro() {
        return 2*altura + 2*base;
    }
}
