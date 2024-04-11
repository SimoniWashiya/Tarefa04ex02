package model;

public class EstudanteTecnico extends Estudante {
    public EstudanteTecnico(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
    }

    @Override
    public float percentualRendimento() {
        return getMediaNotas() * Float.parseFloat(getQtdAprovacoes()) * 0.931f;
    }

    @Override
    public float percentualProgressao() {
        return Integer.parseInt(getQtdAprovacoes()) / 3.0f;
    }
}
