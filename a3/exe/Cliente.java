package a3.exe;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    Endereco end;
    Data dataNascimento;
    Telefone tel;

    Cliente(String nome, String rg, String cpf, Endereco end, Data dataNascimento, Telefone tel){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.end = end;
        this.dataNascimento = dataNascimento;
        this.tel = tel;
    }

    public String toString(){
        return "Nome: " + nome +
               "\nRG: " + rg +
               "\nCPF: " + cpf + 
               "\nData de nascimento: " + dataNascimento +
               "\nTelefone: " + tel +
               "\nEndereço: " + end;
    }
}
