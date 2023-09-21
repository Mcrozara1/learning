package com.mycompany.trabalho_japa_3;

import java.util.Scanner;

public class Trabalho_japa_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            System.out.println("O número digitado pelo japa é : " + vetor[i]);
    }   }
}
