package a3.exe;

public class Endereco {
    String nomeRua;
    int numeroCasa;
    String bairro;
    String cidade;
    String estado;

    Endereco(String nomeRua, int numeroCasa, String bairro, String cidade, String estado){
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString() {
        return "Endereço: " + nomeRua + ", " + numeroCasa + ", " + bairro + ", " + cidade + ", " + estado;
    }
}
