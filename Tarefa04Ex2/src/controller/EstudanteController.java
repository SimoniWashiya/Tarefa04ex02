package controller;

import model.Estudante;

public interface EstudanteController {
    void cadastrarEstudante(Estudante estudante);
    float calcularPercentualRendimento(Estudante estudante);
    float calcularPercentualProgressao(Estudante estudante);
}
