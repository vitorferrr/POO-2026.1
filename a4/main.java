package a4;

public class main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Vitor", 22);

        pessoa.setNome("Jorge");
        pessoa.setIdade(32);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
