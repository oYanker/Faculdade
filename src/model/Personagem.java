package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Personagem {
    private int idade;
    private String nome;
    private String classe;
    private double xp;

    public void criar() {
        nome();
        idade();
        classe();
        xp();
    }

    public void nome() {

        //tratamento basido de nome.
        do {
            nome = JOptionPane.showInputDialog(null, "Informe o nome do personagem: ");
            if (nome.length() <= 3) {
                JOptionPane.showMessageDialog(null, "nome muito curto");
            }
        } while (nome.length() <= 3);
        String nomeFormat = nome.substring(0, 1).toUpperCase() + nome.substring(1);

    }

    public void idade() {

        //controle de idade usando while
        idade = JOptionPane.showConfirmDialog(null, "Seu personagem é maior de idade? ");

        while (idade == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Deve ser maior de idade");
            if (idade == JOptionPane.YES_OPTION) {
                JOptionPane.showInputDialog(null, "Qual a idade dele? ");
            }

        }

        while (idade >= 50 || idade < 18) {
            if (idade >= 50) {
                JOptionPane.showMessageDialog(null, "Personagem muito velho");
            }
            if (idade < 18 && idade > 1) {
                JOptionPane.showMessageDialog(null, "Menor de idade");
            }
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade dele? "));
        }

    }

    public void classe() {
        //escolha de classe
        String[] classSelect = {"Barbaro", "Guerreiro", "Mago", "Ladino", "Druida"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha sua classe", "Selecione a sua classe", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, classSelect, classSelect[0]);
    }

    public void xp() {

        double levelXP = 0.0;

//Faz o loop usando for para pedir ao usuario se ele deseja evoluir o nivel do seu personagem. Se não deseija, ele sairá do loop.
        for (double i = 1.0; i <= 10.0; i++) {
            int request = JOptionPane.showConfirmDialog(null, "Deseja upar de level?");
            if (request == JOptionPane.YES_OPTION) {
                levelXP = i;
                JOptionPane.showMessageDialog(null, "Você subiu para o nivel de XP: " + levelXP);
                if (levelXP == 10.0) {
                    JOptionPane.showMessageDialog(null, "Atingiu o level maximo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não upou. Seu level é: " + levelXP);
                break;
            }

        }
    }

    //Listinha usando array para identificar o personagem com a maior e menor idade
    public void lista() {

        ArrayList<Integer> minhaLista = new ArrayList<>(100);
        minhaLista.trimToSize();
        minhaLista.add(18);
        minhaLista.add(30);
        minhaLista.add(26);
        minhaLista.add(29);
        minhaLista.add(40);

        int min = minhaLista.get(0);
        int max = minhaLista.get(0);
        int sum = 0, sub = 0;
        double avg = 0.0;


        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i) < min) {
                min = minhaLista.get(i);

            }
            if (minhaLista.get(i) > max) {
                max = minhaLista.get(i);
            }
            //calculos simples usando o vetor
            sum += minhaLista.get(i);
            sub -= minhaLista.get(i);
            avg = sum / minhaLista.size();

        }


        minhaLista.remove(Integer.valueOf(min));
        System.out.println("O mais velho tem: " + max + " anos");
        System.out.println("O menor tem: " + min + " anos e foi removido da lista");
        System.out.println("A soma da idade de todos juntos é: " + sum + "\n A subtraçao de todos juntos é: " + sub);
        System.out.println("A média das idades é: " + avg);
        for (int list : minhaLista) {
            System.out.println(list);
        }

    }
}

