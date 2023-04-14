package aula1;

import javax.swing.JOptionPane;

import aula1.monitor.*;

public class App2 {
    public static void main(String[] args) throws Exception {

        Monitor monitorA = new Monitor();

        monitorA.marca = JOptionPane.showInputDialog(null, "Qual a marca do monitor?");
        monitorA.hz = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a frequencia do monitor?"));
        monitorA.screen = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a resolução da tela?"));
        monitorA.showMonitor();
        monitorA.turnOn();
    }
}
