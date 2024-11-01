package aula05.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double soma = 0, nota;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota: ");
            nota = scanner.nextDouble();
            soma = soma + nota;
        }

        System.out.println("A média final é: " + (soma / 5));
    }
}
