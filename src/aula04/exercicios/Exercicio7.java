package aula04.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double n1, n2;

        System.out.println("Digite o número 1: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite o número 2: ");
        n2 = scanner.nextDouble();

        System.out.println(""" 
        Digite a operação que deseja realizar:
          1 - Adição
          2 - Subtração
          3 - Multiplicação
          4 - Divisão
        """);
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("A soma é: " + (n1 + n2));
                break;
            case 2:
                System.out.println("A subtração é: " + (n1 - n2));
                break;
            case 3:
                System.out.println("A multiplicação é: " + (n1 * n2));
                break;
            case 4:
                System.out.println("A divisão é: " + (n1 / n2));
                break;
        }
    }
}
