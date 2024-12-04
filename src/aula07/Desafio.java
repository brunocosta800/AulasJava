package aula07;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    static String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
    static Scanner scanner = new Scanner(System.in);
    static String[][] matrizCadastro;

    public static void main(String[] args) {

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
        System.out.print("Quantas pessoas deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][cabecalho.length];

        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
        }

        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println("Preencha os dados a seguir: ");
            System.out.println(cabecalho[0] + linha);
            novaMatriz[linha][0] = String.valueOf(linha);

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = String.valueOf(linha);
            }
        }

        matrizCadastro = novaMatriz;
    }

    public static void exibirUsuario(){
        String tabela = "";
        for (String[] linha : matrizCadastro){
            for (int coluna = 0; coluna < linha.length; coluna++) {
                tabela += linha[coluna] + "\t\t";
            }
            tabela += "\n";
        }

        System.out.println(tabela);
    }

    public static void atualizarUsuario(){
        System.out.println("atualizarUsuario");
    }

    public static void deletarUsuario(){
        System.out.println("deletarUsuario");
    }
}
