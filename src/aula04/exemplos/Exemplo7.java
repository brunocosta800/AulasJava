package aula04.exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorCompra, valorTotal = 0, desconto = 0.2f;

        System.out.print("Digite o valor da sua compra: ");
        valorCompra = scanner.nextFloat();

        valorTotal = valorCompra > 100.0f ? valorCompra - valorCompra * desconto : valorCompra;
        scanner.close();

        System.out.println("O valor total da compra é: " + valorTotal);
    }
}
