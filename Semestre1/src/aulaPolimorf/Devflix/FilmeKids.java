package aulaPolimorf.Devflix;

public class FilmeKids extends Filme {

    public FilmeKids(String nome, String audio, String legenda) {
        super(nome, audio, legenda);
    }

    public void iniciarKids() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return String.format("(KIDS): O filme %s está com audio em %s e com legenda %s", getNome(), getAudio(),
                getLegenda());
    }

}
