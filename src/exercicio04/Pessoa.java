package exercicio04;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidadeDeNascimento;

    public Pessoa(String nome, int idade, String cidadeDeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeDeNascimento = cidadeDeNascimento;
    }

    public void exibirDados() {
        System.out.println(getNome() + ", " + getIdade() + " anos. Natural de " + getCidadeDeNascimento() + ".");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidadeDeNascimento() {
        return cidadeDeNascimento;
    }

    public void setCidadeDeNascimento(String cidadeDeNascimento) {
        this.cidadeDeNascimento = cidadeDeNascimento;
    }
}
