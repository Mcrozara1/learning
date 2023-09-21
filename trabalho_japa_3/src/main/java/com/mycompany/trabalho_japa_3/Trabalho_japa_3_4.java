
package com.mycompany.trabalho_japa_3;

import java.util.Scanner;

public class Trabalho_japa_3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];
        int contConsoantes = 0;

        System.out.println("Digite 10 caracteres:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");

            caracteres[i] = scanner.next().charAt(0);

            char caracMinusculo = Character.toLowerCase(caracteres[i]);
            
            if (eLetra(caracMinusculo) && !eVogal(caracMinusculo)) {
                contConsoantes++;
                System.out.print(caracteres[i] + " ");
            }
        }

        System.out.println("\nConsoantes lidas: " + contConsoantes);

        System.out.print("Consoantes: ");
        for (int i = 0; i < 10; i++) {
            char caracMinusculo = Character.toLowerCase(caracteres[i]);
            if (eLetra(caracMinusculo) && !eVogal(caracMinusculo)) {
                System.out.print(caracteres[i] + " ");
            }
        }
    }

    public static boolean eLetra(char c) {
        return (c >= 'a' && c <= 'z');
    }

    public static boolean eVogal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
