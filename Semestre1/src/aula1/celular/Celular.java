package aula1.celular;

import javax.swing.JOptionPane;

public class Celular {

    public String nome;
    public String SO;
    public int storage;
    public float screen;

    public void showCelular() {

        JOptionPane.showMessageDialog(null, String.format("Celular %s com tela de %.1f, com %dGB e SO %s",
                nome, screen, storage, SO));

    }

    public void camera() {

        int camera = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para foto ou 2 para vídeo"));

        switch (camera) {

            case 1:
                JOptionPane.showMessageDialog(null, "Tire uma foto");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Grave um vídeo");
                break;
        }

    }

}
