package aula03.exercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        boolean cond1 = false, cond2 = true, cond3 = true;
        int num1 = 3, num2 = 5;

        cond1 = num1 > num2 && num1 < num2;
        cond2 = num1 >= num2 || num1 <= num2;
        cond3 = num1 == num2 && num1 != num2;

        System.out.println(" A condição 1 é " + cond1 + " a 2 é " + cond2 + " e a 3 é " + cond3);
    }
}
