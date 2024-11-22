package aula08.exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");

        if(arquivo.exists()){
            System.out.println("O arquivo já existe");
        }
        else{
            try {
                if(arquivo.createNewFile()){
                    System.out.println("Arquivo " + arquivo.getName() + " criado com sucesso!");
                }
                else{
                    System.out.println("Problema ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
