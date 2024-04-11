package controller;

import model.Estudante;
import model.EstudanteSuperior;

public class EstudanteSuperiorController implements EstudanteController {
    @Override
    public void cadastrarEstudante(Estudante estudante) {
        // Implementação do cadastro para Estudantes Superiores
        System.out.println("Estudante superior cadastrado com sucesso!");
    }

    @Override
    public float calcularPercentualRendimento(Estudante estudante) {
        return estudante.percentualRendimento();
    }

    @Override
    public float calcularPercentualProgressao(Estudante estudante) {
        return estudante.percentualProgressao();
    }
}
