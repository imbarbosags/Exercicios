package Exercicio01;

import java.util.*;

public class Main {
    private static final String ADICIONAR_TAREFA = "Adicionar Exercicio01.Tarefa";
    private static final String VISUALIZAR_TAREFA = "Visualizar Exercicio01.Tarefa";
    private static final String REMOVER_TAREFA = "Remover Exercicio01.Tarefa";
    private static final String SAIR = "Sair";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoTarefa servico = new ServicoTarefa();

        //int opcao = 0;
        String opcao = " ";

        while (opcao != SAIR){
            //Exibindo o menu
            System.out.println("\nMenu: ");
            System.out.println("1. Adicionar Exercicio01.Tarefa");
            System.out.println("2. Visualizar Exercicio01.Tarefa");
            System.out.println("3. Remover Exercicio01.Tarefa");
            System.out.println("4. Sair");
            System.out.println("\nEscolha uma opção");

            //Lendo a escolha do user
            opcao = scanner.nextLine();
            //scanner.nextLine();

            //executando a escolha
            switch (opcao){
                case ADICIONAR_TAREFA:
                    System.out.println("Digite o nome da tarefa a ser adicionada: ");
                    String nomeTarefa = scanner.nextLine();
                    servico.adicionarTarefa(nomeTarefa);
                    break;

                case VISUALIZAR_TAREFA:
                    servico.visualizarTarefas();
                    break;

                case REMOVER_TAREFA:
                    System.out.println("Digite o nome da tarefa que quer remover: ");
                    nomeTarefa = scanner.nextLine();
                    break;

                case SAIR:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opçaõ inválida, tente novamente.");
            }
            //scanner.close();
        }
    }
}