package section8.application;

import section8.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite os dados do produto:");
        System.out.println("Nome: ");
        produto.nome = sc.nextLine();
        System.out.println("Preço unitário: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Digite o numero de produtos adicionados ao estoque: ");
        int quantidade = sc.nextInt();
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
