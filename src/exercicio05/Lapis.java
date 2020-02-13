package exercicio05;

public class Lapis implements Interface {
    private String ehFeitoDe;
    private String escreveCom;

    public Lapis() {
        this.ehFeitoDe = "madeira";
        this.escreveCom = "grafite";
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
