package aula05.exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        do{
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        }while(idade < 18);

        System.out.println("Você é maior de idade");
        scanner.close();
    }
}
