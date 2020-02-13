package exercicio04;

public class Cliente extends Pessoa{
    private String CPF;

    public Cliente(String nome, int idade, String cidadeDeNascimento, String CPF) {
        super(nome, idade, cidadeDeNascimento);
        this.CPF = CPF;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("O seu CPF é: " + this.CPF);
        System.out.println("---------------" );
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
