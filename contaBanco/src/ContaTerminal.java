import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner Scanner = new Scanner(System.in);  
        
        System.out.println("Informe o seu nome: ");
        String nomeCliente = Scanner.nextLine();

        System.out.println("Informe  a agencia: ");
        String agencia = Scanner.nextLine();

        System.out.println("Informe o Número da conta: ");
        int numero = Scanner.nextInt();

        System.out.println("Informe o seu saldo para deposito: ");
        double saldo = Scanner.nextDouble();

        // dados requeridos ao usuario e informados, teremos os resultados:

        System.out.println("Olá " + nomeCliente + "Seja bem vindo (a) a DIOBANK, obrigado por criar uma conta em nosso banco! \n sua agência é: " 
        + agencia + ", CONTA: " + numero + " e seu saldo é: " + saldo);

        

        Scanner.close();
    }
}
