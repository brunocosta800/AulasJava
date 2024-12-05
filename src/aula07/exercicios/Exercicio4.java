package aula07.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double temperatura, conversao;

        System.out.print("Insira a temperatura para converter: ");
        temperatura = scanner.nextDouble();

        conversao = converterCelsiusParaFahrenheit(temperatura);
        System.out.println("A conversão da temperatura é: " + conversao);
    }

    public static Double converterCelsiusParaFahrenheit(Double temperatura){
        return temperatura * 1.8 + 32;
    }
}
