package exercicio01;

public class PessoaEx1 {
    private String nome;
    private String sobrenome;
    private double saldo;

    public PessoaEx1(String nome, String sobrenome, double saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.saldo = saldo;
    }

    public void imprimirNome() {
        System.out.println("O nome da pessoa é: " + this.nome + " " + this.sobrenome + ".");
        System.out.println("---");
    }

    public void oQueAconteceComOSaldo(double dinheiroMovimentado) {
        if (dinheiroMovimentado > 0) {
            System.out.println("Depósito de: " + dinheiroMovimentado + ".");
            System.out.println("Saldo inicial: " + this.saldo);
            this.saldo += dinheiroMovimentado;
            System.out.println("Saldo final: " + this.saldo);
        } else {
            if (dinheiroMovimentado < 0) {
                System.out.println("Saque de: " + dinheiroMovimentado + ".");
                System.out.println("Saldo inicial: " + this.saldo);
                this.saldo -= dinheiroMovimentado;
                System.out.println("Saldo final: " + this.saldo);
            } else {
                if (dinheiroMovimentado == 0) {
                    System.out.println("Saldo inicial: " + this.saldo);
                    System.out.println("Nada acontece.");
                    System.out.println("Saldo final: " + this.saldo);
                }
            }
        }
        System.out.println("------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
