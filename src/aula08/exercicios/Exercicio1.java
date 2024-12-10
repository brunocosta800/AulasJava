package aula08.exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivo = new File("src/aula08", "alunos.txt");
        if(arquivo.exists()){
            System.out.println("Arquivo já existe");
        }else{
            try {
                if(arquivo.createNewFile()){
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                }
                else{
                    System.out.println("Falha ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for (int aluno = 1; aluno <= 5; aluno++) {
            System.out.print("Digite o nome do aluno " + aluno + ": ");
            try{
                FileWriter writer = new FileWriter(arquivo);
                writer.write(scanner.nextLine());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
