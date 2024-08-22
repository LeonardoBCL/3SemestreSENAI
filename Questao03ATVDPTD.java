import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Questao03ATVDPTD {
    public static void main(String[] args) {

        //KEYBOARD:
        Scanner keyboard = new Scanner(System.in);

        //Cáculo de Payback

        //Investimento:
        System.out.println("Insira o valor do investimento: ");
        double investimento = keyboard.nextDouble();

        //Inicializando o array:
        double[] saldos = new double[10];
        double somaSaldos = 0;


        //Coletar os slados e calcular a soma:
        for(int contador = 0; contador < saldos.length; contador++){
            System.out.println("Insira o valor do Saldo " + (contador + 1) + ": ");
            saldos[contador] = keyboard.nextDouble();
            somaSaldos += saldos[contador];
        }


        //Calcular a média dos saldos:
        double media = somaSaldos / saldos.length;
        //Calcular o PB:
        double resultadoFinal = investimento / media;

        //Mostrando resultado:
        System.out.println("Valor do payback corresponde a: " +resultadoFinal);

    }
}