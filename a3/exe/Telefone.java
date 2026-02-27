package a3.exe;

public class Telefone {
    String ddd;
    String numeroTelefone;

    Telefone(String ddd, String numeroTelefone){
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    public String toString(){
        return "Numero de telefone: " + "(" + ddd + ")" + numeroTelefone;
    }
}
