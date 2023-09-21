
package com.mycompany.trabalho_japa_3;
import java.util.Scanner;
/**
 *ta incompleto,eu sei,estou tentando entender como arrumar
 * @author mathe
 */
public class trabalho_japa_3_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        
        int[] v1 = new int[tamanho];
        int[] v2 = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor:");

        for (int i = 0; i < tamanho; i++) {
            v1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");

        for (int i = 0; i < tamanho; i++) {
            v2[i] = scanner.nextInt();
        }

        System.out.println("Primeiro vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(v1[i] + " ");
        }

        System.out.println("\nSegundo vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(v2[i] + " ");
        }

        scanner.close();
    }
}
