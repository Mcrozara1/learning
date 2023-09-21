
package com.mycompany.trabalho_japa_3;

 import java.util.Scanner;
/**
 *
 * esse aqui eu não fazia a minima ideia de como fazer
 * tive que pedir para um colega me mandar,aparentemente tá tudo ok.
 * 
 */
public class Trabalho_japa_3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20]; 
        int[] impares = new int[20]; 
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contPares] = numeros[i];
                contPares++;
            } else {
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}