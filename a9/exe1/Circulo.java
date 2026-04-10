package a9.exe1;

public class Circulo implements FormaGeometrica{
    private double raio; 

    @Override
    public double area(){
        return PI*raio*raio;
    }

    @Override
    public double comprimento(){
        return 2*PI*raio;
    }
}
