package exercicio05;

public class PenaMosquito implements Interface {
    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito() {
        this.ehFeitoDe = "metal";
        this.escreveCom = "nanquim";
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
