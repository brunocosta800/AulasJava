package aula04.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorVendas;

        System.out.println("Digite o valor das vendas do funcionário: ");
        valorVendas = scanner.nextDouble();

        if (valorVendas < 1000){
            System.out.println("O valor da comissão é: " + valorVendas * 0.05);
        } else if (valorVendas >= 1000 && valorVendas <= 5000) {
            System.out.println("O valor da comissão é: " + valorVendas * 0.1);
        }
        else{
            System.out.println("O valor da comissão é: " + valorVendas * 0.15);
        }
    }
}
