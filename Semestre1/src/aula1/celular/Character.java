package aula1.celular;

import java.util.Random;

import javax.swing.JOptionPane;

public class Character {

    public String nome;
    public int idade;
    public int lvl;
    public float XP;
    public String classe;
    public int forca;

    // void significa que não está retornando nada
    public void showStatus() {
        JOptionPane.showMessageDialog(null,
                String.format("O personagem %s tem %d anos, level %d com %.3f de XP, e é um %s",
                        nome, idade, lvl, XP, classe));
    }

    public int calcDano() {

        Random gerador = new Random();
        int d20 = 1 + gerador.nextInt(19);
        int dano = forca + d20;
        return dano;
    }

    // quem passa o valor de "alvo" é o ORC la no APP
    public void attack(String alvo, String habilidade) {
        if (habilidade.length() == 0) {
            JOptionPane.showMessageDialog(null, String.format("%s atacou um inimigo %s de level %d", nome, alvo, lvl));

        } else {
            JOptionPane.showMessageDialog(null,
                    String.format("%s atacou um inimigo %s de level %d usando uma %s", nome, alvo, lvl, habilidade));

        }

        JOptionPane.showMessageDialog(null, String.format("O %s deu %d de dano no %s", nome, calcDano(), alvo));

    }

}
