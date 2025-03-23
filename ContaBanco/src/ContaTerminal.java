import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int conta;
        float saldo;
        String agencia;
        String nomeCliente;

        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta ");
        conta = ler.nextInt();
        ler.nextLine();

        System.out.println("Por favor, digite o número da agência ");
        agencia = ler.nextLine();

        System.out.println("Por favor, digite o nome do cliente ");
        nomeCliente = ler.nextLine();

        System.out.println("Por favor, digite o saldo da conta ");
        saldo = ler.nextFloat();

        System.out.printf("Conta: %d Agência: %s Cliente: %s Saldo: %.2f \n", conta, agencia, nomeCliente, saldo);
        

    }
}
