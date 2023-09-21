
package com.mycompany.trabalho_japa_3;
import java.util.Scanner;
/**
 * @author mathe
 */
public class trabalho_japa_3_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];

        System.out.println("Digite a idade e a altura de 5 pessoas:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Pessoa " + (i + 1) + " - Idade e Altura(em metros em chefia), separe por um espaço: ");
            idades[i] = scanner.nextInt();
            alturas[i] = scanner.nextDouble();
        }

        System.out.println("\nA idades e altura das pessoas na ordem de entrada:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " metros");
        }
        scanner.close();
    }
}
