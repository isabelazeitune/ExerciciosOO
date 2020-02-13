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

    public String getEhFeitoDe() {
        return ehFeitoDe;
    }

    public void setEhFeitoDe(String ehFeitoDe) {
        this.ehFeitoDe = ehFeitoDe;
    }

    public String getEscreveCom() {
        return escreveCom;
    }

    public void setEscreveCom(String escreveCom) {
        this.escreveCom = escreveCom;
    }
}
