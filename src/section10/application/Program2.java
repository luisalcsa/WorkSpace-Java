package section10.application;

import section10.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for(int i=0; i<n; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto(nome,price);
        }

        double soma = 0.0;

        for(int i=0; i<n; i++){
            soma += vect[i].getPreco();
        }

        double media = soma/ vect.length;

        System.out.printf("Média de preço = %.2f%n", media);
        sc.close();
    }
}
