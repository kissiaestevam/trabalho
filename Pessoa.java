public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como " + profissao + ".");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Fulano", 30, "Programador");
        pessoa.andar();
        pessoa.falar();
        pessoa.trabalhar();
    }
}