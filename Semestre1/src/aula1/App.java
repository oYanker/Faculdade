package aula1;

import aula1.celular.*;
import aula1.celular.Character;

public class App {
    public static void main(String[] args) throws Exception {

        // iphone 12, tela de 6.1 polegadas, 256gb
        // galaxy note 20 ultra, tela de 6.9 polegadas, 256gb
        // xiaomi mi 11 pro, tela 6.81gb, 128gb

        // declarando um OBJ do tivo Celular. Criando um novo OBJ iphone 12
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.screen = 6.1f;
        celularA.storage = 256;
        celularA.SO = "iOS";

        // galaxy note 20 ultra
        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.screen = 6.9f;
        celularB.SO = "Android";
        celularB.storage = 256;

        // xiaomi mi 11 pro
        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 PRO";
        celularC.screen = 6.81f;
        celularC.storage = 128;
        celularC.SO = "Android";

        // personagem RPG
        Character charR = new Character();
        charR.nome = "Ronaldo";
        charR.idade = 30;
        charR.lvl = 5;
        charR.XP = 5.000f;
        charR.classe = "Bardo";
        charR.forca = 15;

        charR.showStatus();
        // chamei meu metodo de ataque e usei ORC como argumento
        charR.attack("Orc", "Voadora");

        celularA.showCelular();
        celularA.camera();

    }
}
