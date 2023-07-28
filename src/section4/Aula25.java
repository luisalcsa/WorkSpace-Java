package section4;

import java.util.Scanner;

public class Aula25 {

    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.printf("Voce digitou: %.2f%n" , z);
        sc.close();
    }
}
