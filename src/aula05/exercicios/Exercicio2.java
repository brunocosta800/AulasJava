package aula05.exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 0;
        while (i <= 100){
            if(i % 2 == 0){
                soma = soma + i;
            }
            i++;
        }
        System.out.println(soma);
    }
}
