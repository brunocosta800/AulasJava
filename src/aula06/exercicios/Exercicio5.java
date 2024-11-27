package aula06.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"André", "Bruno", "Carlos"};
        String nomeBuscado;
        boolean encontrado = false;

        System.out.print("Digite o nome que deseja buscar: ");
        nomeBuscado = scanner.next();

        for (String nome : nomes){
            if(nomeBuscado.equals(nome)){
                encontrado = true;
            }
        }

        if(encontrado){
            System.out.println("Nome encontrado!");
        }else{
            System.out.println("Nome não encontrado");
        }
    }
}
