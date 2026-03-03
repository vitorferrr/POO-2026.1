package a4.exe4;

public class Funcionario {
    private int matricula;
    private String nome;
    Depart depart;

    public Funcionario(int matricula, String nome, Depart depart){
        this.matricula = matricula;
        this.nome = nome;
        this.depart = depart;
    }


    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "\n" + depart + 
               "\n--DADOS FUNCIONÁRIO--" +
               "\nMatricula: " + matricula +
               "\nNome funcionário: " + nome;
    }
}
