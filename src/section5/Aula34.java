package section5;

import java.util.Scanner;

public class Aula34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Que horas são?");

        int hora = sc.nextInt();

        if ( hora < 12 ) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
