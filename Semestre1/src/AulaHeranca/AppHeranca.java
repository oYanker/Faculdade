package AulaHeranca;

import AulaHeranca.Model.Cachorro;
import AulaHeranca.Model.Dragao;
import AulaHeranca.Model.Pombo;

public class AppHeranca {

    public static void main(String[] args) throws Exception {

        Cachorro cachorro = new Cachorro("Lucas");
        Dragao dragao = new Dragao("Carlos");
        Pombo pombo = new Pombo("Leo");
        cachorro.bebeu();
        cachorro.latir();
        dragao.soltarFogo();
        pombo.fazerPruh();
        pombo.enviarCarta();
    }
}
