import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        Scanner leitor = new Scanner(System.in);
;
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = leitor.nextInt();

        System.out.println("Por favor, digite a agência: ");
        numeroAgencia = leitor.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = leitor.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");

    }

}