package section8.application;

import section8.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e altura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("Area: %.2f%n", retangulo.area());
        System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());

        sc.close();

    }
}
