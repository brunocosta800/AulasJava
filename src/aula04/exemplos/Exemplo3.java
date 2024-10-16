package aula04.exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            if (idade >= 0 && idade <= 12) {
                System.out.println("Você é uma criança");
                break;
            } else if (idade >= 13 && idade < 18) {
                System.out.println("Você é um adolescente");
                break;
            } else if (idade >= 19 && idade <= 59) {
                System.out.println("Você é um adulto");
                break;
            } else if (idade >= 60) {
                System.out.println("Você é um idoso");
                break;
            } else {
                System.out.println("Idade inválida, digite novamente");
            }
        }
        scanner.close();
    }
}
