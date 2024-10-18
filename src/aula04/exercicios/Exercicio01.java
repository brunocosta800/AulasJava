package aula04.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();

        if (idade >= 0 && idade <= 17){
            System.out.println("Acesso negado");
        }
        else if (idade > 18){
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("Idade inválida");
        }

        scanner.close();
    }
}
