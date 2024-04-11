package controller;

import model.Estudante;
import model.EstudanteTecnico;

public class EstudanteTecnicoController implements EstudanteController {
    @Override
    public void cadastrarEstudante(Estudante estudante) {
        // Implementa��o do cadastro para Estudantes T�cnicos
        System.out.println("Estudante t�cnico cadastrado com sucesso!");
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
