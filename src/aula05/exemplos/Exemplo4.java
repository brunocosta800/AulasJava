package aula05.exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("""
                    ----------------------------------------------------------------------------
                                          Bem-vindo ao SENAI Telefônica
                                          
                    Digite uma opção:
                    1 - Ligar para o Rafael
                    1 - Ligar para o Orrico
                    1 - Ligar para o Lucas
                    1 - Ligar para o Paulo Roberto
                    5 - Sair
                    ----------------------------------------------------------------------------
                    """);

            opcao = scanner.nextInt();
        }while(opcao != 5);
    }
}
