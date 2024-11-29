package aula07;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String menu = """
                ________________________________________
                |    Escolha uma opção:                |
                |       1 - Exibir Cadastro Completo   |
                |       2 - Cadastrar Usuário          |
                |       3 - Atualizar Usuário          |
                |       4 - Deletar Usuário            |
                |       5 - Sair                       |
                ________________________________________
                """;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    exibirUsuario();
                    break;

                case 2:
                    cadastrarUsuario();
                    break;

                case 3:
                    atualizarUsuario();
                    break;

                case 4:
                    deletarUsuario();
                    break;

                case 5:
                    System.out.println("Fim do programa");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 5);
    }

    public static void cadastrarUsuario(){
        System.out.println("cadastrarUsuario");
    }

    public static void exibirUsuario(){
        System.out.println("exibirUsuario");
    }

    public static void atualizarUsuario(){
        System.out.println("atualizarUsuario");
    }

    public static void deletarUsuario(){
        System.out.println("deletarUsuario");
    }
}
