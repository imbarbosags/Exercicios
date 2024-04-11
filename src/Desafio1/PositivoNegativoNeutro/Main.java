package Desafio1.PositivoNegativoNeutro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Solicitando ao user que digite um número
        String input = JOptionPane.showInputDialog("Digite um número: ");

        //Transformando o input para um número inteiro
        int numero = Integer.parseInt(input);

        //Verificando se o número é positivo, negativo ou neutro
        if(numero > 0){
            JOptionPane.showMessageDialog(null,"Número Positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Número neutro");

        }
    }
}