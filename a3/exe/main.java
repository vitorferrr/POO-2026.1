package a3.exe;

public class main {
    public static void main(String[] args) {
        Data nascimento = new Data(14, 12, 2003);

        Telefone telefone1 = new Telefone("81", "999999999");

        Endereco endereco1 = new Endereco("Rua Faustino Porto", 275, "Boa Viagem", "Recife", "Pernambuco");

        Cliente cliente1 = new Cliente("Vitor", "123456", "654321", endereco1, nascimento, telefone1);

        System.out.println(cliente1);
    }
}
