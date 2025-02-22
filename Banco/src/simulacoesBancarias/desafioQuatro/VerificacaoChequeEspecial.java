package simulacoesBancarias.desafioQuatro;
import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define o limite do cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque pode ser realizado normalmente
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial) {
            // Verifica se o saque pode ser coberto pelo cheque especial
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            // Caso o saque ultrapasse o limite do cheque especial
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
