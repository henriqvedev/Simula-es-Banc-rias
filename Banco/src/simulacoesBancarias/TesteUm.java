package simulacoesBancarias;
import java.util.InputMismatchException;
import java.util.Scanner;
//Aqui eu tentei fazer o banco virtual do projeto do meu jeito sem saber que tinha que usar BufferedReader
public class TesteUm{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Saldo Atual : " + saldo);
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");

            System.out.print("Escolha uma opção: ");
            try {
                int opcaoDigitada = entrada.nextInt();
                entrada.nextLine();

                switch (opcaoDigitada) {
                    case 1:
                        System.out.print("Valor a ser depositado: ");
                        if (entrada.hasNextFloat()) {
                            float valorDeposito = entrada.nextFloat();
                            entrada.nextLine(); // Consumir a quebra de linha pendente

                            if (valorDeposito > 0) {
                                saldo += valorDeposito;
                                System.out.printf("Depósito realizado! Saldo atual: %.2f%n", saldo);
                            } else {
                                System.out.println("Valor inválido para depósito.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                            entrada.nextLine(); // Consumir a entrada inválida
                        }
                        break;

                    case 2:
                        System.out.print("Valor a ser sacado: ");
                        if (entrada.hasNextFloat()) {
                            float valorSaque = entrada.nextFloat();
                            entrada.nextLine(); // Consumir a quebra de linha pendente

                            if (valorSaque > 0 && valorSaque <= saldo) {
                                saldo -= valorSaque;
                                System.out.printf("Saque realizado! Saldo atual: %.2f%n", saldo);
                            } else {
                                System.out.println("Saldo insuficiente ou valor inválido.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                            entrada.nextLine(); // Consumir a entrada inválida
                        }
                        break;

                    case 3:
                        System.out.printf("Saldo atual: %.2f%n", saldo);
                        break;

                    case 4:
                        System.out.println("Programa encerrado.");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                entrada.nextLine(); // Consumir a entrada inválida
            }
        }

        entrada.close();
    }
}
