package exercicio05;

public class Caneta implements Interface {
    private String ehFeitoDe;
    private String escreveCom;

    public Caneta() {
        this.ehFeitoDe = "plastico";
        this.escreveCom = "tinta";
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com " + this.escreveCom);

    }

}
