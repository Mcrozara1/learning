
package com.mycompany.trabalho_japa_3;
import java.util.Scanner;
/**
 * @author mathe
 */
public class trabalho_japa_3_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorjapa = new int[10];

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorjapa[i] = scanner.nextInt();
        }

        int somaQuadrados = 0;

        for (int numero : vetorjapa) {
            somaQuadrados += numero * numero;
        }

        System.out.println("\nA soma dos quadrados dos elementos do vetor é: " + somaQuadrados);

        scanner.close();
    }
}
