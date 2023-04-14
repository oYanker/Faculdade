package AulaInterface.model;

import AulaInterface.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
