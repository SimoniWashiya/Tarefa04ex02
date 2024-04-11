package model;

public class Estudante {
    private String ra;
    private String nome;
    private String email;
    private float mediaNotas;
    private String qtdAprovacoes;

    // Construtor
    public Estudante(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.mediaNotas = mediaNotas;
        this.qtdAprovacoes = qtdAprovacoes;
    }

    // Getters e Setters
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(float mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public String getQtdAprovacoes() {
        return qtdAprovacoes;
    }

    public void setQtdAprovacoes(String qtdAprovacoes) {
        this.qtdAprovacoes = qtdAprovacoes;
    }

    // Métodos para cálculo de percentual de rendimento e progressão
    public float percentualRendimento() {
        // Implementação padrão, será sobrescrito nas subclasses
        return 0;
    }

    public float percentualProgressao() {
        // Implementação padrão, será sobrescrito nas subclasses
        return 0;
    }
}
