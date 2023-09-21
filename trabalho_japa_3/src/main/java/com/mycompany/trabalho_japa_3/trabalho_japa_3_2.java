

package com.mycompany.trabalho_japa_3;

import java.util.Scanner;

public class trabalho_japa_3_2 {
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[10];

        System.out.println("Escolha 10 números reais aí meu querido :");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Agora eles ao contrario:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}






