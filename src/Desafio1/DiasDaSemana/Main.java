package Desafio1.DiasDaSemana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número de 1 a 7: ");
        int numero = Integer.parseInt(input);

        String dia = determinarDia(numero);

        JOptionPane.showMessageDialog(null, "O dia correspondente é: " + dia);
    }

    public static String determinarDia(int numero){
        String dia;
        switch (numero){
            case 1:
                dia = DiasDaSemana.DOMINGO;
                break;
            case 2:
                dia = DiasDaSemana.SEGUNDA;
                break;
            case 3:
                dia = DiasDaSemana.TERCA;
                break;
            case 4:
                dia = DiasDaSemana.QUARTA;
                break;
            case 5:
                dia = DiasDaSemana.QUINTA;
                break;
            case 6:
                dia = DiasDaSemana.SEXTA;
                break;
            case 7:
                dia = DiasDaSemana.SABADO;
            default:
                dia = "Dia inválido!";
        }
        return dia;
    }
}
