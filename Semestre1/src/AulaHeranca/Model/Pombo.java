package AulaHeranca.Model;

import AulaHeranca.Animais.Animal;

public class Pombo extends Animal {

    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void voar() {
        System.out.printf("O %s voou\n", getNome());

    }

    public void fazerPruh() {
        System.out.printf("O %s fez PRUH\n", getNome());

    }

    public void enviarCarta() {
        System.out.printf("O %s enviou um total de %d\n", getNome(), cartasEnviadas);
        this.cartasEnviadas++;

    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

}
