package aula04.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double preco;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço de sua compra: ");
        preco = scanner.nextDouble();

        if (preco > 100.00){
            System.out.println("O seu desconto foi de: R$ " + preco * 0.1);
            System.out.println("E o preço final é: R$ " + (preco - (preco * 0.1)));
        }
        else{
            System.out.println("O seu desconto foi de: R$ 0");
            System.out.println("E o preço final é: R$ " + preco);
        }
    }
}
