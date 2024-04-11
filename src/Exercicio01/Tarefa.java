package Exercicio01;

import java.util.*;
class Tarefa {
    private String nome;

    // Construtor
    public Tarefa(String nome) {
        this.nome = nome;
    }

    // Método getter para o nome da tarefa
    public String getNome() {
        return nome;
    }

    // Método setter para o nome da tarefa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString para imprimir a tarefa
    @Override
    public String toString() {
        return "Exercicio01.Tarefa: " + nome;
    }

    // Sobrescreva o método equals para comparar tarefas pelo nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(nome, tarefa.nome);
    }

    // Sobrescreva o método hashCode para calcular o código de hash baseado no nome
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}