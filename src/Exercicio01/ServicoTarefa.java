package Exercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServicoTarefa {
    //Coleção p armazenar as tarefas
    private List<Tarefa> tarefas;

    public ServicoTarefa(){
        tarefas = new ArrayList<>();
    }

    //Método p add tarefa

    public void adicionarTarefa(String nome){
        Tarefa novaTarefa = new Tarefa(nome);
        if(!tarefas.contains(novaTarefa)){
            tarefas.add(novaTarefa);
            System.out.println("Exercicio01.Tarefa adicionada com sucssso!");
        }else{
            System.out.println("Já existe uma tarefa com esse nome.");
        }
    }

    //Método pra ver todas as tarefas
    public void visualizarTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("Não há tarefas pra visualizar.");
        }else{
            System.out.println("Lista de tarefas: ");
            for (Tarefa tarefa : tarefas){
                System.out.println(tarefa);
            }
        }
    }
    //Método pra remover tarefa
    public void removerTarefa(String nome){
        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()){
            Tarefa tarefa = iterator.next();
            if (tarefa.getNome().equals(nome)){
                iterator.remove();
                System.out.println("Exercicio01.Tarefa removida!");
                return;
            }
        }
        System.out.println("Não foi encontarada nenhuma tarefa com esse nome.");
    }
}
