import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

    }
}