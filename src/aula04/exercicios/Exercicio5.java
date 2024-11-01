package aula04.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double qtdeHorasTrabalhadas, salario, horasExtras, valorHora;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        qtdeHorasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o salario: ");
        salario = scanner.nextDouble();

        valorHora = salario / 40;

        if(qtdeHorasTrabalhadas > 40){
            horasExtras = qtdeHorasTrabalhadas - 40;
            System.out.println("O valor das suas horas extras é: " + horasExtras * (valorHora * 1.5));
        }
    }
}
