package simulacoesBancarias.desafioTres;
import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
