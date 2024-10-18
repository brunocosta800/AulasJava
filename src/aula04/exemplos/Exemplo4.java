package aula04.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;
        System.out.print("Digite a cor do semáforo: ");
        corSemaforo = scanner.next().toLowerCase();

        switch (corSemaforo){
            case "vermelho":
                System.out.println("Pare");
                break;

            case "amarelo":
                System.out.println("Atenção");
                break;

            case "verde":
                System.out.println("Siga");
                break;

            default:
                System.out.println("Cor inválida");
        }

        scanner.close();
    }
}
