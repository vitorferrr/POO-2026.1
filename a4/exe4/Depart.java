package a4.exe4;

public class Depart {
    private int codigo;
    private String nome;

    public Depart(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
    public String toString(){
        return "--DEPARTAMENTO--" +
               "\nCodigo: " + codigo +
               "\nNome do departamento: " + nome;
    }
}
