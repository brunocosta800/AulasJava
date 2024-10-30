package aula06.exemplos;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int i = 0, num = 4;
        for (int numero : numeros){
            i++;
            if(numero == num){
                System.out.println(i);
            }
        }
    }
}
