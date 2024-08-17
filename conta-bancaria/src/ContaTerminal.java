import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, Insira seu primeiro nome!");
        String primeiroNome = scanner.next();

        System.out.println("Qual o saldo?");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + primeiroNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " e seu saldo " + saldo + " já está disponivél para saque.");

    }
}