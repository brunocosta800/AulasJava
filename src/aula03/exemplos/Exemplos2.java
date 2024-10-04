package aula03.exemplos;

public class Exemplos2 {
    public static void main(String[] args) {
        Integer total, num1 = 8, num2 = 4;

        total = num1 + num2;
        System.out.println("O total da soma é ".concat(total.toString()));
        total = num1 - num2;
        System.out.println("O total da subtração é ".concat(total.toString()));
        total = num1 * num2;
        System.out.println("O total da multiplicação é ".concat(total.toString()));
        total = num1 / num2;
        System.out.println("O total da divisão é ".concat(total.toString()));
        total = num1 % num2;
        System.out.println("O total do módulo é ".concat(total.toString()));
    }
}
