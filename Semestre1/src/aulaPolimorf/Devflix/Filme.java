package aulaPolimorf.Devflix;

public class Filme extends Video {

    private String audio;
    private String legenda;

    public Filme(String nome, String audio, String legenda) {
        super(nome);
        this.audio = audio;
        this.legenda = legenda;

        if (audio == "PTBR") {
            this.legenda = "desligada";
        } else {
            this.legenda = "PTBR";
        }
    }

    public void inicarNormal() {
        System.out.println(toString());

    }

    public String getAudio() {
        return audio;
    }

    @Override
    public String toString() {
        return String.format("O filme %s está com audio em %s e com legenda %s", getNome(), getAudio(),
                getLegenda());
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

}
