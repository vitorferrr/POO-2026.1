package a8.exe2;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double area(){
        return Math.PI*Math.sqrt(this.raio);
    }

    public double comprimento(){
        return (2*Math.PI*this.raio);
    }
}
