import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Agora, por favor, digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Por favor, informe a agência: ");
        String agencia = sc.next();

        System.out.println("Agora, por favor, informe o númrero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por fim, informe o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome
                + "!, obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numeroConta
                + " e seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
