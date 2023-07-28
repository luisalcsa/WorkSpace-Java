package section10.application;

import section10.entities.Funcionario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Funcionário #" + (i+1) +": " );
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);

            list.add(funcionario);
        }

        System.out.println("Digite o ID do funcionário que terá aumento salarial: ");
        int idAumento = sc.nextInt();
        Funcionario funcionario = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

        if(funcionario ==null){
            System.out.println("ID não existe");
        }
        else {
            System.out.print("Qual a porcentagem do aumento? ");
            double porcentagem = sc.nextDouble();
            funcionario.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for(Funcionario func : list){
            System.out.println(func);
        }
        sc.close();
    }


}
