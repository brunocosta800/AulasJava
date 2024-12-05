package aula07.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double nota1, nota2, nota3, notaFinal;

        System.out.print("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = scanner.nextDouble();

        notaFinal = calcularMedia(nota1, nota2, nota3);
        System.out.println("Sua média final é: " + notaFinal);
    }

    public static Double calcularMedia(Double n1, Double n2,Double n3){
        Double media = (n1 + n2 + n3)/3;
        return media;
    }
}
