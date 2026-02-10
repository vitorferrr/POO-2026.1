package exe1;

public class quadrado {
    double lado;

    quadrado(double lado) {
        this.lado = lado;
    }

    quadrado() {
        this.lado = 0;
    }
    

    double area(){
        return lado*lado;
}

    double perimetro(){
        return 4*lado;
    }

    String texto(){
        return "Quadrado de lado " + this.lado;
    }

    void desenho(){
        System.out.println("DESENHO:");

        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < this.lado; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
