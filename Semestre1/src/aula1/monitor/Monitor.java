package aula1.monitor;

import java.util.Random;

import javax.swing.JOptionPane;

public class Monitor {

    public String marca;
    public int screen;
    public float hz;

    int channel() {
        Random gerador = new Random();
        int canal = gerador.nextInt(300);
        return canal;
    }

    public void showMonitor() {

        JOptionPane.showMessageDialog(null, String.format(
                "Seu monitor é um %s com uma resolução de %dp e com uma frequencia de %.1fHz", marca, screen, hz));

    }

    private boolean tOn = false;

    public void turnOn() {
        String on = JOptionPane.showInputDialog(null, "Para ligar o monitor escreva algo na caixa");
        if (on.length() > 0) {
            JOptionPane.showMessageDialog(null, String.format("Monitor ligado no canal %d", channel()));
            tOn = true;
        } else {
            JOptionPane.showMessageDialog(null, "Monitor continua desligado");
        }

        String off = JOptionPane.showInputDialog(null, "Deseja desligar o monitor? Escreva algo na caixa");
        if (off.length() > 0) {
            JOptionPane.showMessageDialog(null, "Monitor desligado");
            tOn = false;
        } else {
            JOptionPane.showMessageDialog(null, "Continua Ligado");
        }
    }

}
