public class Triangulo implements FiguraGeometrica {
    private double base, altura, lado1, lado2, lado3;

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
        this.base = lado1;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
        this.altura = (this.lado2 * this.lado2) - ((this.base / 2) * (this.base / 2));
    }

    public double getArea() {
        return (this.base * this.altura) / 2;
    }
    public String getNomeFigura() {
        return "triangulo";
    }
    public double getPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }
}
