import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, n4, media;

        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = entrada.nextDouble();

        System.out.print("Digite a quarta nota: ");
        n4 = entrada.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é: " + media);

    }
}