
package com.mycompany.trabalho_japa_3;

import java.util.Scanner;
/**
 * @author mathe
 */
public class Tabalho_japa_3_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeAlunos = 10;
        int contMedia = 0;

        for (int i = 0; i < numeroDeAlunos; i++) {
            double somaNotas = 0;

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                somaNotas += scanner.nextDouble();
            }

            double media = somaNotas / 4;

            if (media >= 6.0) {
                contMedia++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 6.0: " + contMedia);
    }
}
