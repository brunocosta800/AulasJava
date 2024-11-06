package aula06.exemplos;

public class Exemplo2 {
    public static void main(String[] args) {
        int[][] numero = new int [2][3];
        numero[0][0] = 1;
        numero[0][1] = 2;
        numero[0][2] = 3;
        numero[1][0] = 4;
        numero[1][1] = 5;
        numero[1][2] = 6;

        System.out.println("Valor da posição 0 = " + numero[0][2]);
    }
}
