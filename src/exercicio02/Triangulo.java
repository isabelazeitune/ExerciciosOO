package exercicio02;

public class Triangulo {
    private double base;
    private double altura;
    private double area;
    // não precisa do atributo área, então no método pode-se retornar double o cálculo sem nome de atributo

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area() {
        this.area = (this.base * this.altura) / 2;
        System.out.println("A área do triângulo de base " + this.base + " e altura " + this.altura + " é: " + this.area);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
