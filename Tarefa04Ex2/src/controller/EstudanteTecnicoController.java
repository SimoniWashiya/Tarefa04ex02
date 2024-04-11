package controller;

import model.Estudante;
import model.EstudanteTecnico;

public class EstudanteTecnicoController implements EstudanteController {
    @Override
    public void cadastrarEstudante(Estudante estudante) {
        // Implementação do cadastro para Estudantes Técnicos
        System.out.println("Estudante técnico cadastrado com sucesso!");
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
