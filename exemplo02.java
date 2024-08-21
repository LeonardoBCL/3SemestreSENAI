package exemplos;

import java.util.Scanner;

import java.util.Scanner;

class Item {
    String nome;
    double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}

public class exemplo02 {

    // Função de ordenação Bubble Sort para a Ferramenta ABC
    public static void bubbleSort(Item[] itens) {
        int n = itens.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (itens[j].valor < itens[j + 1].valor) {
                    // Troca os itens de posição usando a variável auxiliar `aux`
                    Item aux = itens[j];
                    itens[j] = itens[j + 1];
                    itens[j + 1] = aux;
                }
            }
        }
    }

    // Função para análise ABC
    public static void analisarABC(Scanner scanner) {
        System.out.println("Quantos itens deseja cadastrar para análise ABC?");
        int quantidade = scanner.nextInt();
        Item[] itens = new Item[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do item " + (i + 1) + ": ");
            String nome = scanner.next();
            System.out.println("Digite o valor do item " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            itens[i] = new Item(nome, valor);
        }

        // Ordena os itens em ordem decrescente com base no valor usando Bubble Sort
        bubbleSort(itens);

        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.valor;
        }

        double acumulado = 0;
        for (Item item : itens) {
            acumulado += item.valor;
            double percentual = (acumulado / valorTotal) * 100;
            if (percentual <= 70) {
                System.out.println(item.nome + " - Classe A");
            } else if (percentual <= 90) {
                System.out.println(item.nome + " - Classe B");
            } else {
                System.out.println(item.nome + " - Classe C");
            }
        }
    }

    // Função para análise XYZ
    public static void analisarXYZ(Scanner scanner) {
        System.out.println("Quantos itens deseja cadastrar para análise XYZ?");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o nome do item " + i + ": ");
            String nome = scanner.next();

            System.out.println("Digite o coeficiente de variação do item " + i + ": ");
            double coeficienteVariacao = scanner.nextDouble();

            if (coeficienteVariacao < 0.2) {
                System.out.println(nome + " - Categoria X");
            } else if (coeficienteVariacao < 0.5) {
                System.out.println(nome + " - Categoria Y");
            } else {
                System.out.println(nome + " - Categoria Z");
            }
        }
    }

    // Função para cálculo do Lote Econômico de Compras (LEC)
    public static void calcularLEC(Scanner scanner) {
        System.out.println("Digite a demanda anual:");
        double demandaAnual = scanner.nextDouble();

        System.out.println("Digite o custo do pedido:");
        double custoPedido = scanner.nextDouble();

        System.out.println("Digite o custo de armazenamento:");
        double custoArmazenamento = scanner.nextDouble();

        double lec = Math.sqrt((2 * demandaAnual * custoPedido) / custoArmazenamento);

        System.out.println("Lote Econômico de Compras (LEC): " + lec);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a análise desejada:");
        System.out.println("1. Análise ABC");
        System.out.println("2. Análise XYZ");
        System.out.println("3. Cálculo do Lote Econômico de Compras (LEC)");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                analisarABC(scanner);
                break;
            case 2:
                analisarXYZ(scanner);
                break;
            case 3:
                calcularLEC(scanner);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }
}