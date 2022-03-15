import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();
        Scanner input = new Scanner(System.in);

        System.out.println("insira o lado do quadrado: ");
        q1.setLado(input.nextDouble());

        System.out.printf("\nO %s cujo o lado mede %2f, tem uma area de %2f e um perimetro de %2f", q1.getNomeFigura(), q1.getLado(), q1.getArea(), q1.getPerimetro());

        System.out.println("\ninsira o primeiro lado do triangulo: ");
        t1.setLado1(input.nextDouble());
        System.out.println("\ninsira o segundo lado do triangulo: ");
        t1.setLado2(input.nextDouble());
        System.out.println("\ninsira o terceiro lado do triangulo: ");
        t1.setLado3(input.nextDouble());

        System.out.printf("\nO %s cujos os lados medem %2f, %2f e %2f, cuja a altura mede %2f, e a base mede %2f, tem uma area de %2f e um perimetro de %2f", t1.getNomeFigura(), t1.getLado1(), t1.getLado2(), t1.getLado3(), t1.getAltura(), t1.getBase(), t1.getArea(), t1.getPerimetro());
    
        input.close();
    }
}
