package ContaBanco;

import java.util.Scanner;

class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private int saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        String mensagem = conta.menu();
        System.out.println(mensagem);
    }

    public String menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem-vindo ao sistema do banco. Por favor, digite seus dados:");

        System.out.println("Número da conta:");
        this.numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Nome do cliente:");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Número da agência:");
        this.agencia = scanner.nextLine();

        System.out.println("Saldo do cliente:");
        this.saldo = Integer.parseInt(scanner.nextLine());

        scanner.close();

        return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é a de número " +
               this.agencia + ", conta de número " + this.numero + " e seu saldo de " + this.saldo + "R$ já está disponível para saque.";
    }
}
