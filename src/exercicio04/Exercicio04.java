package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Isabela", 27, "Votuporanga-SP", "111.111.111-11");
        Funcionario funcionario1 = new Funcionario("Isabela", 27, "Votuporanga-SP", 260875);

        cliente1.exibirDados();
        funcionario1.exibirDados();

    }
}
