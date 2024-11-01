package aula04.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int codProduto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        codProduto = scanner.nextInt();

        switch (codProduto){
            case 1:
                System.out.println("Seu produto é um eletrônico");
                break;
            case 2:
                System.out.println("Seu produto é um alimento");
                break;
            case 3:
                System.out.println("Seu produto é um vestuário");
                break;
        }
    }
}
