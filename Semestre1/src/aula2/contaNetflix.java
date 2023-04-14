package aula2;

import javax.swing.JOptionPane;

public class contaNetflix {

    private String idiomaPref;
    private String screenRes;

    public void entrar() {
        // coletar o idioma
        // coletar a resolução
        buscarPref();
        identficarRes();

    }

    // buscar as configurações preferenciais do usuario
    private void buscarPref() {

        idiomaPref = "PT-BR";

    }

    // coletar a informação da resolução
    private void identficarRes() {
        screenRes = "FULL HD, 1080p";

    }

    // metodo publico para iniciar o app para assistir
    public void Assistir(String nomefilme) {

        login();
        JOptionPane.showMessageDialog(null, String.format("Iniciando o filme " + nomefilme));
        JOptionPane.showMessageDialog(null, String.format("Resolução do filme em " + screenRes));
        audioFilme();
        timerFilme();
    }

    // informação e coleta sobre o idioma do filme
    private void audioFilme() {
        if (idiomaPref == "PT-BR" || idiomaPref == "US-EN") {
            JOptionPane.showMessageDialog(null, "Carregando o filme em " + idiomaPref);

        } else {
            JOptionPane.showMessageDialog(null, "carregando por padr'ao em outro idioma ");
        }
    }

    // método de login
    private void login() {

        String username = "";
        String password = "";

        do {
            username = JOptionPane.showInputDialog(null, "Digite o nome de usuráio");
            password = JOptionPane.showInputDialog(null, "Digite a senha");

            if (username.length() == 0 || password.length() == 0) {
                JOptionPane.showMessageDialog(null, "Usuário e senha obrigatórios");
            }

        } while (username.length() == 0 || password.length() == 0);
    }

    // método simples de temporizador do filme
    private void timerFilme() {

        float duracao = 30;
        JOptionPane.showMessageDialog(null, "Duração do filme é:" + duracao);

        for (duracao = 30; duracao > 0; duracao--) {

            JOptionPane.showMessageDialog(null, duracao);
        }

    }
}
