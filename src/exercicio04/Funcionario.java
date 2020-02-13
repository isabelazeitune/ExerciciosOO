package exercicio04;

public class Funcionario extends Pessoa {
    private int numeroDeMatricula;

    public Funcionario(String nome, int idade, String cidadeDeNascimento, int numeroDeMatricula) {
        super(nome, idade, cidadeDeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("O seu número de matrícula é: " + this.numeroDeMatricula);
        System.out.println("---------------" );
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
}
