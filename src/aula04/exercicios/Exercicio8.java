package aula04.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avaliacaoDesempenho;
        double n1, n2;

        System.out.println("Digite a avaliação de desempenho do funcionário: ");
        avaliacaoDesempenho = scanner.nextInt();

        switch (avaliacaoDesempenho){
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Excelente");
                break;
        }
    }
}
