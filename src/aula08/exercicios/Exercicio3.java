package aula08.exercicios;

import java.io.*;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        File arquivoOriginal = new File("src" + File.separator + "aula08", "alunos.txt");
        File arquivoBackup = new File("src" + File.separator + "aula08", "backup_alunos.txt");

        if (arquivoBackup.exists()) {
            System.out.println("Arquivo já existe");
        } else {
            try {
                if (arquivoBackup.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + arquivoBackup.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoOriginal))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                try {
                    try (FileWriter writer = new FileWriter(arquivoBackup, true)) {
                        writer.write(linha + "\n");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
