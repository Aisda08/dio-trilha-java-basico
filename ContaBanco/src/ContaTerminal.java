import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Digite o número da Agência!");
         int numeroAgencia = scanner.nextInt();
         scanner.nextLine();

         System.out.println("Digite a Agência!");
         String agencia = scanner.nextLine();

         System.out.println("Digite o Nome do Cliente!");
         String nomeCliente = scanner.nextLine();

         System.out.println("Digite o Nome o Saldo");
         double saldo = scanner.nextDouble();

         String mensagemSaida = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
         nomeCliente, agencia, numeroAgencia, saldo);
         System.out.println(mensagemSaida);

         scanner.close();
    }
}
