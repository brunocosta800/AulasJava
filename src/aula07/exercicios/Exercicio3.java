package aula07.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, dobro;

        System.out.print("Insira o primeiro número inteiro: ");
        numero = scanner.nextInt();

        dobro = dobrar(numero);
        System.out.println("O dobro do número inserido é: " + dobro);
    }

    public static int dobrar(int numero){
        return numero * 2;
    }
}
