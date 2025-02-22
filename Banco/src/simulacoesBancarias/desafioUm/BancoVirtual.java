package simulacoesBancarias.desafioUm;
import java.io.*;

//Desafio 1

public class BancoVirtual {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double saldo = 0.0;
        boolean continuar = true;

        while (continuar) {
            int opcao = Integer.parseInt(br.readLine());

            switch (opcao) {
                case 1: // Depositar
                    double deposito = Double.parseDouble(br.readLine());
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2: // Sacar
                    double saque = Double.parseDouble(br.readLine());
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3: // Consultar Saldo
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0: // Encerrar
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

