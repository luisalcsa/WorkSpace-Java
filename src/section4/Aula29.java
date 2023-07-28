package section4;

import java.util.Locale;
import java.util.Scanner;

public class Aula29 {

    public static void main(String[] args) {

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma  = x + y;

        System.out.println("SOMA = " + soma);

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

        double w = sc.nextDouble();
        double a = 3.14159 * w * w;

        System.out.printf("A = %.4f%n", a);

        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int total = b * c - d * e;

        System.out.println("Diferença = " + total);

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int numero = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("Number = " + numero);
        System.out.printf("Salario = R$ %.2f%n" , salario);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int peca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double vlrUnitario1 = sc.nextDouble();
        int peca2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double vlrUnitario2 = sc.nextDouble();

        double pgto = qtdPeca1 * vlrUnitario1 + qtdPeca2 * vlrUnitario2;

        System.out.printf("Valor a pagar: R$ %.2f%n", pgto);

        sc.close();
    }
}
