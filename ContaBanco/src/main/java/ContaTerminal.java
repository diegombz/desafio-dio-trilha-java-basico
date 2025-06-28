import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, Digite o Nome!");
        String nomeCliente = scan.nextLine();

        System.out.println("Por Favor, Digite o Número da Conta!");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Por Favor, Digite o Número da Agência!");
        String agencia = scan.nextLine();

        System.out.println("Por Favor, Digite o Saldo!");
        double saldo = scan.nextDouble();

        System.out.println("Olá "
                + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia
                + ", conta "
                + numeroConta
                + " e seu saldo "
                + saldo
                + " já está disponível");

        scan.close();
    }
}
