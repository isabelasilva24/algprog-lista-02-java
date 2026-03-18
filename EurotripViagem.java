import java.util.Scanner;

public class EurotripViagem {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double alemanha, portugal, italia, total;
        int pessoas;

        System.out.print("Digite o preço da viagem para Alemanha: ");
        alemanha = entrada.nextDouble();

        System.out.print("Digite o preço da viagem para Portugal: ");
        portugal = entrada.nextDouble();

        System.out.print("Digite o preço da viagem para Itália: ");
        italia = entrada.nextDouble();

        System.out.print("Digite a quantidade de pessoas: ");
        pessoas = entrada.nextInt();

        total = (alemanha + portugal + italia) * pessoas;

        System.out.println("O valor total da Eurotrip é: R$ " + total);

    }
}