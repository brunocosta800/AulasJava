package aula06.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double somaNotas = 0, mediaFinal = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Insira a nota: " + (i + 1));
            notas[i] = scanner.nextDouble();
        }

        for (double nota : notas){
            somaNotas += nota;
        }

        mediaFinal = somaNotas / 4;

        System.out.println("A sua média final foi: " + mediaFinal);
    }
}
