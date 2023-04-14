package aulaPolimorf.Devflix;

import javax.swing.JOptionPane;

public class Video {

    private String nome;
    private int kids;

    /*
     * metodo de entrada usando a variavel KIDS para escolher entre o modo KIDS e
     * normal
     */
    public void entrar() {

        /*
         * Função para determinar entre o modo KIDS e normal usando 'DO' para forçar que
         * o usuario escolha alguma opção.
         */
        do {
            kids = JOptionPane.showConfirmDialog(null, "Deseja entrar no modo KIDS?");

            if (kids == JOptionPane.YES_OPTION) {
                System.out.println("Modo kids ativado");
                FilmeKids kidsMode = new FilmeKids("Marvel", "EN", "PT");
                kidsMode.iniciarKids();
            } else if (kids == JOptionPane.NO_OPTION) {
                System.out.println("Modo normal");
                Filme normalMode = new Filme("TLOU", "PTBR", "PT");
                normalMode.inicarNormal();
            }
        } while (kids == JOptionPane.CANCEL_OPTION);
    }

    public Video(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
