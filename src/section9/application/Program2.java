package section9.application;

import section9.entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco banco;

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String nome = sc.next();
        System.out.print("Deposito inicial? S/N: ");
        char resposta = sc.next().charAt(0);

        if(resposta == 's'){
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            banco = new Banco(numero, nome, depositoInicial);
        }
        else {
            banco = new Banco(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Informe o valor do depósito: ");
        double depositoValor = sc.nextDouble();
        banco.deposito(depositoValor);
        System.out.println("Atualizacão bancária: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Informe o valor do saque: ");
        double saqueValor = sc.nextDouble();
        banco.saque(saqueValor);
        System.out.println("Atualizacão bancária: ");
        System.out.println(banco);

        sc.close();
    }
}
