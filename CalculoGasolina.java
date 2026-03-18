import java.util.Scanner;

public class CalculoGasolina {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precoLitro, litros, total;

        System.out.print("Digite o preço do litro da gasolina: ");
        precoLitro = entrada.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        litros = entrada.nextDouble();

        total = precoLitro * litros;

        System.out.println("O valor a pagar é: R$ " + total);

    }
}