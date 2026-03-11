import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não está apto a votar.");
        } else if (idade < 18) {
            System.out.println("Pode votar (voto facultativo).");
        } else if (idade < 70) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Pode votar (voto facultativo).");
        }

        scanner.close();
    }
}