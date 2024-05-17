import java.util.Locale;
import java.util.Scanner;

/**
 * Este projeto tem como finalidade entregar o desafio proposto pela DIO, no
 * módulo de Java básico.
 * Um simulador de conta bancária onde serão solicitados os dados do usuário
 * [agencia, número da conta, nome e saldo].
 * Em seguida, será exibida uma mensagem no terminal mostrando todas as
 * informações fornecidas pelo usuário
 */

/*
 * Exigências:
 * 
 * Conta - Int ; Agencia - String; Nome - String; Saldo - Double;
 * Usar a classe Scanner para entrada de dados
 * Mensagens antes da entrada dos dados
 * 
 * Ao finalizar:
 * 
 * "Olá [nome], obrigado por criar uma conta em nosso banco,
 * sua agencia é [Agencia], conta [número da conta],
 * e seu saldo [saldo] já está disponível para saque!"
 * 
 */

public class ContaTerminal {

    public static void main(String[] args) {

        // Instanciando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declarando variáveis
        String nome, agencia;
        int conta;
        double saldo;

        // Solcitando dados do usuário
        System.out.println("Por favor, informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque!");

    }

}
