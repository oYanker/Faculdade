package AulaInterface;

import AulaInterface.model.CalculadorArea;
import AulaInterface.model.Circulo;
import AulaInterface.model.Quadrado;

public class AppInterface {
    public static void main(String[] args) throws Exception {

        Circulo circuloPequeno = new Circulo(2);
        Quadrado quadrado = new Quadrado(5);
        CalculadorArea calculador = new CalculadorArea();
        System.out.println(circuloPequeno.calcularArea());
        System.out.println(quadrado.calcularArea());
        System.out.println(calculador.somarAreas(quadrado, quadrado));
    }
}