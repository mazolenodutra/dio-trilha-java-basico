import java.util.Scanner;

/**
 * Classe que simula a abertura de uma conta bancária através de interação com o
 * usuário.
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e obter o número da conta do usuário
        System.out.println("Seja bem-vindo ao nosso banco!\nPor favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        // Solicitar e obter o número da agência do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine(); // Consumir a quebra de linha

        // Solicitar e obter o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();
        scanner.nextLine(); // Consumir a quebra de linha

        // Inicializar a variável saldoConta
        double saldoConta = 0.0;
        // Solicitar e obter o valor do depósito inicial
        System.out.print("Por favor, digite o valor do seu depósito inicial: ");
        String inputSaldoConta = scanner.nextLine();
        saldoConta = Double.parseDouble(inputSaldoConta);

        // Exibir informações da conta criada
        System.out.println("==========================================================");
        System.out.println("                   - BANCO DIO LTDA -         ");
        System.out.println("----------------------------------------------------------");
        System.out.println("          -    Abertura de Conta-Corrente    -");
        System.out.println("----------------------------------------------------------");
        // Exibir mensagem formatada com os dados da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, \nsua agência é "
                + numeroAgencia + ", conta " + numeroConta + "\n e seu saldo R$ " + (saldoConta)
                + " já está disponível para saque.");
        System.out.println("==========================================================");

        scanner.close(); // Fechar o Scanner
    }
}