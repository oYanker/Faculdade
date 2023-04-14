package aula3.classes;

import javax.swing.JOptionPane;

public class ContaBanco {

    private float salario = 0;
    private String nomeBanco = "";
    private int numeroConta = 0;

    public float getSalario() {
        JOptionPane.showMessageDialog(null, "Saldo de: " + salario);
        return salario;
    }

    public void setSalario(float salario) {

        do {

            if (salario < 0) {
                salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor inválido, digite novamente: "));
            } else {
                JOptionPane.showMessageDialog(null, "Seu saldo é de: " + salario);
            }
        } while (salario < 0);
        this.salario = salario;

    }

    public String getNomeBanco() {
        JOptionPane.showInputDialog(null, "Digite o nome do banco: ");
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumeroConta() {
        JOptionPane.showInputDialog(null, "Digite o número da conta");
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

}
