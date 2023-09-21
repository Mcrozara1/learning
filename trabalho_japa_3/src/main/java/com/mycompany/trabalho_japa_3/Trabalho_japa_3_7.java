
package com.mycompany.trabalho_japa_3;

import java.util.Scanner;
/**
 * @author mathe
 * não entendi oque era pra fazer nesse não
 */
public class Trabalho_japa_3_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            System.out.println("Número " + (i + 1) + ": " + vetor[i]);
        }

        scanner.close();
    }
}
