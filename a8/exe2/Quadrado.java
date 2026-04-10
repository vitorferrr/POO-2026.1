package a8.exe2;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double area(){
        return (Math.sqrt(this.lado));
    }

    public double comprimento(){
        return (4*this.lado);
    }
}
