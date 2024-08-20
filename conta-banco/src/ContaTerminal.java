
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero = 1021;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.print("Agora, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o Saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem com os dados inseridos

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta" + nomeCliente + " e seu saldo é R$ " + saldo);

        System.out.println("Seu saldo já está disponível para saque.");

        // Lembre-se de fechar o scanner

        scanner.close();
    }

    
}
