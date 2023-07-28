package section5;

import java.util.Scanner;

public class Aula38 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Digite um numero correspondente ao dia da semana: ");
        int d = sc.nextInt();

        String dia;

        switch (d){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
