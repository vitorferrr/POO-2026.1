package a3.exe;

public class main {
    public static void main(String[] args) {
        Data nascimento1 = new Data(14, 12, 2003);

        Telefone telefone1 = new Telefone("81", "9 9999-9999");

        Endereco endereco1 = new Endereco("Rua Faustino Porto", 275, "Boa Viagem", "Recife", "Pernambuco");

        Cliente cliente1 = new Cliente("Vitor", "123456", "987.654.321-00", endereco1, nascimento1, telefone1);

        System.out.println(cliente1);
    }
}
