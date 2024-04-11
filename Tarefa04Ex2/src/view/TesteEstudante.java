package view;

import controller.EstudanteController;
import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.Estudante;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class TesteEstudante {
    public static void main(String[] args) {
        // Criando inst�ncias de estudantes t�cnico e superior
        Estudante tecnico = new EstudanteTecnico("123456", "Jo�o", "joao@gmail.com", 7.5f, "8");
        Estudante superior = new EstudanteSuperior("654321", "Maria", "maria@gmail.com", 8.0f, "6",
                "Escola X", 2018);

        // Criando inst�ncias dos controladores
        EstudanteController tecnicoController = new EstudanteTecnicoController();
        EstudanteController superiorController = new EstudanteSuperiorController();

        // Testando opera��es para estudante t�cnico
        tecnicoController.cadastrarEstudante(tecnico);
        System.out.println("Percentual de rendimento (t�cnico): " + tecnicoController.calcularPercentualRendimento(tecnico));
        System.out.println("Percentual de progress�o (t�cnico): " + tecnicoController.calcularPercentualProgressao(tecnico));

        System.out.println();

        // Testando opera��es para estudante superior
        superiorController.cadastrarEstudante(superior);
        System.out.println("Percentual de rendimento (superior): " + superiorController.calcularPercentualRendimento(superior));
        System.out.println("Percentual de progress�o (superior): " + superiorController.calcularPercentualProgressao(superior));
    }
}
