package aula3.classes;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {
        JOptionPane.showMessageDialog(null, "Caracteristicas da pessoa");

        mostrarPessoa();

    }

    public void mostrarPessoa() {

        nome = "bla bla";
        idade = 53;
        altura = 3.89;

        JOptionPane.showMessageDialog(null,
                String.format("Meu nome é %s, tenho %d anos de idade e %,.2f de altura", nome, idade, altura));

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
