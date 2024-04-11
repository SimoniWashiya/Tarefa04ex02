package view;

import controller.EstudanteController;
import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.Estudante;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class TesteEstudante {
    public static void main(String[] args) {
        // Criando instâncias de estudantes técnico e superior
        Estudante tecnico = new EstudanteTecnico("123456", "João", "joao@gmail.com", 7.5f, "8");
        Estudante superior = new EstudanteSuperior("654321", "Maria", "maria@gmail.com", 8.0f, "6",
                "Escola X", 2018);

        // Criando instâncias dos controladores
        EstudanteController tecnicoController = new EstudanteTecnicoController();
        EstudanteController superiorController = new EstudanteSuperiorController();

        // Testando operações para estudante técnico
        tecnicoController.cadastrarEstudante(tecnico);
        System.out.println("Percentual de rendimento (técnico): " + tecnicoController.calcularPercentualRendimento(tecnico));
        System.out.println("Percentual de progressão (técnico): " + tecnicoController.calcularPercentualProgressao(tecnico));

        System.out.println();

        // Testando operações para estudante superior
        superiorController.cadastrarEstudante(superior);
        System.out.println("Percentual de rendimento (superior): " + superiorController.calcularPercentualRendimento(superior));
        System.out.println("Percentual de progressão (superior): " + superiorController.calcularPercentualProgressao(superior));
    }
}
