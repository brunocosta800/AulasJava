package aula08.exemplos;

import java.io.*;

public class Exemplo3 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo texto a ser gravado no arquivo");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha = bufferedReader.readLine();
            System.out.println(linha);
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
