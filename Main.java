import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a demanda anual:");
        double demandaAnual = scanner.nextDouble();

        System.out.println("Digite o custo do pedido:");
        double custoPedido = scanner.nextDouble();

        System.out.println("Digite o custo de armazenamento:");
        double custoArmazenamento = scanner.nextDouble();

        System.out.println("Digite o preço unitário:");
        double precoUnitario = scanner.nextDouble();


        double lec = Math.sqrt((2 * demandaAnual * custoPedido) / (custoArmazenamento * precoUnitario));

        System.out.println("Lote Econômico de Compras (LEC): " + lec);

        scanner.close();
    }
}