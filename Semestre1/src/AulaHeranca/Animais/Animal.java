package AulaHeranca.Animais;

import javax.swing.JOptionPane;

public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comeu() {

        System.out.printf("%s comeu\n", nome);

    }

    public void bebeu() {
        System.out.printf("%s bebeu\n", nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
