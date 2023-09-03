import java.util.Scanner;

import models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        Integer numero = sc.nextInt();

        System.out.println("Digite o numero da agencia que voce deseja: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome completo: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        Conta conta = new Conta(numero, agencia, nomeCliente);
        System.out.println(conta);

        sc.close();
    }
}
