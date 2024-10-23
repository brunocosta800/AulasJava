package aula05.exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular a tabuada: ");
        int x = scanner.nextInt();

        for (int i = 0; i < 100000 + 1; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
