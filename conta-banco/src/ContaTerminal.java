import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite a agência");
        agencia = scanner.next();

        System.out.println("Digite o numero da conta");
        numeroConta = scanner.nextInt();

        System.out.println("Digite seu nome");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo disponível");
        saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + 
                            numeroConta + " e o seu saldo " + saldo + " já está disponível para saque");
        
    }
}
