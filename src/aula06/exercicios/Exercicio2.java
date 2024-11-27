package aula06.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letras = {"a", "b", "c", "d", "e", "f"};
        String letraBuscada;

        System.out.print("Digite uma letra que deseja buscar: ");
        letraBuscada = scanner.next();

        for (int i = 0; i < letras.length; i++){
            if(letras[i].equals(letraBuscada)){
                System.out.println("A letra foi achada na posição: " + i);
            }
        }
    }
}
