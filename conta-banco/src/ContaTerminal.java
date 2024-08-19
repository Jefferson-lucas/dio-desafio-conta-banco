import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite a agência: ");
        agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        numeroConta = scanner.nextInt();

        //Esvaziando o buffer do scanner para não dar erro quando nome contiver espaços
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo disponivel (Informar centavos separados por ,): ");
        scanner.reset();
        saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + 
                            numeroConta + " e o seu saldo de " + saldo + " já está disponível para saque."); 
    }
}
