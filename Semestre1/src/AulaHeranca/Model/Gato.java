package AulaHeranca.Model;

import AulaHeranca.Animais.Animal;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.printf("O %s miou\n", getNome());

    }

}
