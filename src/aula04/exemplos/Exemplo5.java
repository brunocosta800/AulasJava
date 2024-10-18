package aula04.exemplos;

import java.util.Random;
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        int opcao, num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                    Escolha uma opção:
                    1 - Opção 1
                    2 - Opção 2
                    3 - Opção 3
                """);
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Parabéns você escolheu a opção 1");
                break;
            case 2:
                System.out.println("Parabéns você escolheu a opção 2");
                break;
            case 3:
                System.out.println("Parabéns você escolheu a opção 3");
                break;
        }
    }
}
