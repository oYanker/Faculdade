package AulaInterface.model;

import AulaInterface.FiguraGeometrica;

public class CalculadorArea {
    public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }
}
