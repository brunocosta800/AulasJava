package aula04.exemplos;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insira a cor do semáforo: ");
            String corSemaforo = scanner.nextLine();

            if (corSemaforo.toLowerCase().equals("verde")) {
                System.out.println("Siga");
                break;
            } else if (corSemaforo.toLowerCase().equals("amarelo")) {
                System.out.println("Atenção");
                break;
            } else if (corSemaforo.toLowerCase().equals("vermelho")) {
                System.out.println("Pare");
                break;
            } else {
                System.out.println("Cor inválida, digite novamente\n");
            }
        }
    }
}
