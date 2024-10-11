package aula03.exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        int valor1 = 5, valor2 = 3;
        boolean comparacao;
        comparacao = valor1 > valor2;
        System.out.println("A comparação de valor1 > valor2 é " + comparacao);

        comparacao = valor1 < valor2;
        System.out.println("A comparação de valor1 < valor2 é " + comparacao);

        comparacao = valor1 >= valor2;
        System.out.println("A comparação de valor1 >= valor2 é " + comparacao);

        comparacao = valor1 <= valor2;
        System.out.println("A comparação de valor1 <= valor2 é " + comparacao);

        comparacao = valor1 == valor2;
        System.out.println("A comparação de valor1 == valor2 é " + comparacao);

        comparacao = valor1 != valor2;
        System.out.println("A comparação de valor1 != valor2 é " + comparacao);
    }
}
