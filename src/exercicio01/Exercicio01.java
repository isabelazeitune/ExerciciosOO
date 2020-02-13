package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        PessoaEx1 pessoa1 = new PessoaEx1("Ivo", "La Pluma", 10000);
        PessoaEx1 pessoa2 = new PessoaEx1("Leo", "Barbosa", 10000);
        PessoaEx1 pessoa3 = new PessoaEx1("Fabio", "Vieira", 10000);

        pessoa1.imprimirNome();
        pessoa1.oQueAconteceComOSaldo(-100);

        pessoa2.imprimirNome();
        pessoa2.oQueAconteceComOSaldo(100);

        pessoa3.imprimirNome();
        pessoa3.oQueAconteceComOSaldo(0);
    }

}
