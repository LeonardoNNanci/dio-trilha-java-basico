import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Informe o número da conta:");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo da conta:");
        saldo = Float.parseFloat(scanner.nextLine());

        System.out.println("Olá "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}
