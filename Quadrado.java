public class Quadrado implements FiguraGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return this.lado * this.lado;
    }
    public String getNomeFigura() {
        return "quadrado";
    }
    public double getPerimetro() {
        return this.lado * 4;
    }
    
    
}
