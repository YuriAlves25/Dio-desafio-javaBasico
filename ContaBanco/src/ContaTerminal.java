import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        int number;
        String agency;
        String clientName;
        double balance;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da sua conta");
        number = scanner.nextInt();

        System.out.println("Por favor, digite o numero da sua agencia");
        agency = scanner.next();

        System.out.println("Por favor, digite o seu nome");
        clientName = scanner.next();

        System.out.println("Por favor, digite o seu saldo");
        balance = scanner.nextDouble();


        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo de " + balance + " já está disponível para saque");
    }
}