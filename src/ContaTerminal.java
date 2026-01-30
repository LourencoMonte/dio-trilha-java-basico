import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua agência:");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da sua conta:");
        String conta = sc.nextLine();

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o valor inicial para abertura de conta:");
        float saldo = sc.nextFloat();
        sc.nextLine(); 

        System.out.printf("Olá %s!. Bem-vindo ao banco Master! Sua agencia é %s e sua conta %s. ", nome, agencia, conta);
        System.out.printf("Seu saldo inicial é: R$ %.2f e já está disponível para saque. ", saldo);

        sc.close();
    }
}
