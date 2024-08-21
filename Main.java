import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Variável de leitura
        Scanner keyboard = new Scanner(System.in);
        //CA = Compra Anual em quantidade

        double CompraAnualEmQuantidade;
        System.out.println("Insira o valor de compra anual em quantidade (CA):");
        CompraAnualEmQuantidade = keyboard.nextDouble();

        //Cáculo A e B:
        double valoresA[] = new double[3];
        valoresA[0] = 100;
        valoresA[1] = 353;
        valoresA[2] = 1000;

        //B -> Número de pedidos anuais = Consumo anual em quant / Quantidade pedida:
        //B -> CA / A
        double ValoresB[] = new double[3];
        ValoresB[0]= CompraAnualEmQuantidade / valoresA[0];
        ValoresB[1] = CompraAnualEmQuantidade / valoresA[1];
        ValoresB[2] = CompraAnualEmQuantidade / valoresA[2];

        //Imprimindo:
        System.out.println("Valor de B¹ = " +ValoresB[0]);
        System.out.println("Valor de B² = " +ValoresB[1]);
        System.out.println("Valor de B³ = " +ValoresB[2]);

        //C = Estoque médio = Quantidade pedida / 2 x Preço unitário
        //Obtendo valor de C:
        double ValoresC[] = new double [3];
        ValoresC[0] = valoresA[0] / 2 * 25;
        System.out.println("Imprimindo Valor de C¹: "+ValoresC[0]);
        ValoresC[1] = valoresA[1] / 2 * 25;
        System.out.println("Imprimindo valor de C²: "+ValoresC[1]);
        ValoresC[2] = valoresA[2] / 2 * 25;
        System.out.println("Imprimindo valor de C³:" +ValoresC[2]);

        //D -> (Custo de posse) = Custo do material armazenado(CPA) * estoque medio(C)
        //Obtendo o valor de D:
        double CPA;
        System.out.println("\n");
        System.out.println("Para o cálculo do D, insira o valor do Custo do material armazenado (CPA): ");
        CPA = keyboard.nextDouble();

        double valoresD[] = new double [3];
        valoresD[0] = CPA * ValoresC[0];
        valoresD[1] = CPA * ValoresC[1];
        valoresD[2] = CPA * ValoresC[2];
        //Imprimindo valores correspondentes ao D:
        System.out.println("Imprimindo valor de D¹: " +valoresD[0]);
        System.out.println("Imprimindo valor de D²: " +valoresD[1]);
        System.out.println("Imprimindo valor de D³: " +valoresD[2]);

        //E -> Custo do Pedido = Custo do Pedido de Compras(CC) * Número de pedidos anuais(B)
        //Obtendo valor de E:
        double CC;
        System.out.println("Para o calculo de E, insira o valor do Custo do Pedido de Compras (CC)");
        CC = keyboard.nextDouble();
        double valoresE[] = new double[3];
        valoresE[0] = CC * 30;
        valoresE[1] = CC * 8;
        valoresE[2] = CC * 3;
        //Imprimindo valores corerspondentes ao E:
        System.out.println("Imprimindo valor de E¹: " + valoresE[0]);
        System.out.println("Imprimindo valor de E²: " + valoresE[1]);
        System.out.println("Imprimindo valor de E³: " + valoresE[2]);

        //F -> (Custo Total) = D + E
        //Obtendo o valor de F:
        double valoresF[] = new double[3];
        valoresF[0] = valoresD[0] + valoresE[0];
        valoresF[1] = valoresD[1] + valoresE[1];
        valoresF[2] = valoresD[2] + valoresE[2];

        //Imprimindo valores correspondentes ao F:
        System.out.println("\nImprimindo valor de F¹: " + valoresF[0]);
        System.out.println("Imprimindo valor de F²: " + valoresF[1]);
        System.out.println("Imprimindo valor de F³: " + valoresF[2]);


        double menorValor = valoresF[0];

        // Loop para percorrer os valores do vetor
        for (int i = 1; i < valoresF.length; i++) {
            // Se o valor atual for menor que o menor valor encontrado até agora
            if (valoresF[i] < menorValor) {
                // Atualiza o menor valor
                menorValor = valoresF[i];
            }
        }
        // Imprime o menor valor encontrado
        System.out.println("O MENOR valor encontrado é: " + menorValor);
    }
    }
