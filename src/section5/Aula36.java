package section5;

import java.util.Scanner;

public class Aula36 {

    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int x = sc.nextInt();

        if ( x >= 0){
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        System.out.println("Digite um numero: ");
        int y = sc.nextInt();

        if ( y % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

        System.out.println("Digite dois numeros: ");
        int z = sc.nextInt();
        int w = sc.nextInt();

        if ( z % w == 0 || w % z == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
