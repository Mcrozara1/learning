
package com.mycompany.trabalho_japa_3;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class trabalho_japa_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        System.out.println("Manda tuas 4 notas aí:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 4;

        System.out.println("A média das suas notas é : " + media);
    }
}