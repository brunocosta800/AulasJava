package aula04.exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = scanner.nextInt();

        if(x>30)
            System.out.println("Número maior que 30");
        else
            System.out.println("Número menor que 30");
    }
}
