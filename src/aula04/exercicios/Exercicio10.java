package aula04.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valorReais;

        System.out.println("Digite o valor em reais: ");
        valorReais = scanner.nextDouble();

        System.out.println("Digite para qual moeda deseja converter: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O valor em dólar é: US$" + (valorReais * 5.8));
                break;
            case 2:
                System.out.println("O valor em euro é: €" + (valorReais * 6.31));
                break;
            case 3:
                System.out.println("O valor em libra esterlina é: £" + (valorReais * 7.51));
                break;
        }
    }
}
