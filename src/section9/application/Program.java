package section9.application;



import section9.entities.Produto2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite os dados do produto:");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Preço unitário: ");
            double preco = sc.nextDouble();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto2 produto = new Produto2(nome, preco , quantidade);

            produto.setNome("computador");

            System.out.println("Dados do produto: " + produto);

            System.out.println();
            System.out.println("Digite o numero de produtos adicionados ao estoque: ");
            quantidade = sc.nextInt();
            produto.adicionarProdutos(quantidade);

            System.out.println();
            System.out.println("Dados atualizados: " + produto);

            System.out.println();
            System.out.println("Digite o numero de produtos removidos do estoque: ");
            quantidade = sc.nextInt();
            produto.removerProdutos(quantidade);

            System.out.println();
            System.out.println("Dados atualizados: " + produto);

            sc.close();
        }
    }
