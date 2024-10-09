package aula03.exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int varInt = scanner.nextInt();
        System.out.println("Você digitou o número "+varInt);
        short varShort = (short)varInt;
        System.out.println("Você digitou o número "+varShort);
        byte varByte = (byte)varInt;
        System.out.print("Você digitou o número "+varByte);
    }
}