package section8.application;

import section8.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite nome, salário bruto e imposto: ");
        funcionario.nome = sc.nextLine();
        funcionario.salarioBruto = sc.nextDouble();
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println(funcionario);

        System.out.println();
        System.out.println("Qual a porcentagem do aumento salarial?");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados " + funcionario);

        sc.close();
    }
}
