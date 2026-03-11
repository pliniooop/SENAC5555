import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario, desconto;

        System.out.print("Digite o salário: ");
        salario = scanner.nextDouble();

        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.println("Desconto do INSS: " + desconto);

        scanner.close();
    }
}