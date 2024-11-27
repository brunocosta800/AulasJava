package aula06.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaTrue = 0, somaFalse = 0;
        boolean [] trueOrFalse = new boolean[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Insira True ou False para a posição " + (i + 1));
            trueOrFalse[i] = scanner.nextBoolean();
        }

        for (boolean bool : trueOrFalse){
            if (bool){
                somaTrue += 1;
            }
            else{
                somaFalse += 1;
            }
        }

        System.out.println("Foram inseridos " + somaTrue + " True");
        System.out.println("Foram inseridos " + somaFalse + " False");
    }
}
