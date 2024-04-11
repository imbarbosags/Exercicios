import javax.swing.JOptionPane;

public class PositivoNegativoNeutro {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);

        imprimirContagemFor(numero);
        imprimirContagemWhile(numero);
        imprimirContagemDoWhile(numero);
    }

    public static void imprimirContagemFor(int numero){
        System.out.println("Utilizando for:");
        for (int i = 0; i <= numero; i++){
            System.out.println(i);
        }
    }
    public static void imprimirContagemWhile(int numero){
        System.out.println("Utilizando while");
        int i = 0;
        while (i <= numero){
            System.out.println(i);
            i++;
        }
    }
    public static void imprimirContagemDoWhile(int numero){
        System.out.println("Utilizando do-while: ");
        int i = 0;
        do{
            System.out.println(i);
            i++;
        } while (i <= numero);
    }
}