package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 9);
        Triangulo triangulo2 = new Triangulo(4.5, 123);
        Triangulo triangulo3 = new Triangulo(153, 325);

        triangulo1.area();
        triangulo2.area();
        triangulo3.area();
    }

}
