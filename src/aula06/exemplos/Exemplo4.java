package aula06.exemplos;

public class Exemplo4 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        System.out.println("Valor da posição [2][1] = " + matrizNumeros[2][1]);

        String[][] matrizNomes = {{"Rafael", "Gislene"},{"Lara", "Luana"}};
        System.out.println("Valor da posição [1][1] = " + matrizNomes[1][1]);
    }
}
