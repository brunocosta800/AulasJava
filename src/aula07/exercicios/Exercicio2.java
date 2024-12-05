package aula07.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSoma, n1, n2;

        System.out.print("Insira o primeiro número inteiro: ");
        n1 = scanner.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        n2 = scanner.nextInt();
        totalSoma = somar(n1, n2);
        System.out.println("A soma dos dois número é: " + totalSoma);
    }

    public static int somar(int n1, int n2){
        return n1 + n2;
    }
}
