package aula05.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean primo = true;

        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                primo = false;
                System.out.println("O número não é primo");
                break;
            }
        }

        if(primo == true){
            System.out.println("O número é primo");
        }
    }
}
