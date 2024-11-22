package aula08.exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");
        escreverNoArquivo(arquivo, " Terceiro texto");
    }

    public static void escreverNoArquivo(File arquivo, String texto){
        try{
            FileWriter fileWriter = new FileWriter(arquivo, true);
            fileWriter.write("\n" + texto);
            fileWriter.close();

            imprimirArquivo(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void imprimirArquivo(File arquivo){
        int caracter;
        try{
            FileReader fileReader = new FileReader(arquivo);
            while((caracter = fileReader.read()) != -1){
                System.out.print((char)caracter);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
