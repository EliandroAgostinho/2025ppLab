//Eliandro Agostinho
import java.util.Scanner;

public class FazCalculos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + calc.soma(num1, num2));
        System.out.println("Subtração: " + calc.subtracao(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicacao(num1, num2));
        System.out.println("Divisão: " + calc.divisao(num1, num2));
    }
}
