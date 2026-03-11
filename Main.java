import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario, prestacao, limite;

        System.out.print("Digite o salário bruto: ");
        salario = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        prestacao = scanner.nextDouble();

        limite = salario * 0.30;

        if (prestacao <= limite) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        scanner.close();
    }
}