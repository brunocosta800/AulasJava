package aula08.exercicios;

import java.io.*;

public class Exercicio2 {
    public static void main(String[] args) {
        File arquivo = new File("src" + File.separator + "aula08", "alunos.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
            String linha;
            int aluno = 1;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println("Nome do aluno " + aluno + ": " + linha+"\n");
                aluno++;
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
