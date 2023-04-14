package AulaHeranca.Model;

import AulaHeranca.Animais.Animal;

public class Dragao extends Animal {

    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo() {
        System.out.printf("O %s soltou fogo\n", getNome());

    }

    public void voar() {
        System.out.printf("O %s voou\n", getNome());

    }

}
