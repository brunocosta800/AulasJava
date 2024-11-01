package aula04.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaAluno;

        System.out.println("Digite a nota final: ");
        notaAluno = scanner.nextDouble();

        if (notaAluno < 5){
            System.out.println("O aluno está reprovado");
        } else if (notaAluno < 7) {
            System.out.println("O aluno está de recuperação");
        }else{
            System.out.println("O aluno está aprovado");
        }
    }
}
