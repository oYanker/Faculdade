package AulaHeranca.Model;

import AulaHeranca.Animais.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.printf("O %s latiu\n", getNome());

    }

    public void lamber() {
        System.out.printf("O %s lambeu\n", getNome());

    }

}
