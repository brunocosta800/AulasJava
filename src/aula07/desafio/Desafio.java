package aula07.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro={{"",""}} ;
    static Scanner scanner= new Scanner((System.in));

    public static void main(String[] args) {
        matrizCadastro[0]=cabecalho;
        String menu = """
                _________________________________________
                |   Escolha uma opção:                  |
                |       1 - Exibir Cadastro Completo    |
                |       2 - Cadastrar Usuario           |
                |       3 - Atualizar Usuario           |
                |       4 - Deletar Usuario             |
                |       5 - Sair                        |
                |_______________________________________|
                """;
        int opcao;
        do{
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
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while(opcao!=5);

    }

    private static void exibirUsuario() {
        String tabela = "";
        for (String[] linha : matrizCadastro) {
            for (int coluna = 0; coluna < linha.length; coluna++) {
                tabela += linha[coluna] + "\t\t"; // Espaçamento estre as colunas
            }
            tabela += "\n"; //Para pular para a próxima linha
        }
        System.out.println(tabela);
    }

    private static void cadastrarUsuario() {
        System.out.print("Quantas pessoas você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][cabecalho.length];
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length);
        }
        System.out.println("Preencha os dados a seguir:");
        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0]+" - " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); // Converte valor inteiro para o String

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna]+": ");
                novaMatriz[linha][coluna] = scanner.nextLine();
            }
        }
        matrizCadastro=novaMatriz;
    }
    private static void atualizarUsuario() {
    }
    private static void deletarUsuario() {
    }
}
