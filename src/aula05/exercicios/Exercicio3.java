package aula05.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int i, fatorial;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        i = scanner.nextInt();

        fatorial = i;

        do{
            fatorial = fatorial * (i-1);
            i--;
        }while(i >= 2);

        System.out.println(fatorial);
    }
}
