package section6;

import java.util.Locale;
import java.util.Scanner;

public class Aula54 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp = sc.next().charAt(0);
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", f);
            System.out.print("Deseja repetir? S/N");
        } while (resp != 0);

        sc.close();
    }
}

