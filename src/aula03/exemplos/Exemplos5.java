package aula03.exemplos;

import java.util.Scanner;

public class Exemplos5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Digite um número: ");
        x = scanner.nextInt();
        scanner.close();

        System.out.println("Número digitado: " + x);
    }
}
