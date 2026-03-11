import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // força uso de ponto

        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Ordem decrescente: " + num1 + " " + num2);
        } else {
            System.out.println("Ordem decrescente: " + num2 + " " + num1);
        }

        scanner.close();
    }
}