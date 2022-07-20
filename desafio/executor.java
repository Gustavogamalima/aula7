package desafio;

import java.util.Scanner;

public class executor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Delta d1 = new Delta();

        System.out.println("Escreva o valor de A:");
        d1.setA(scan.nextDouble());

        System.out.println("Escreva o valor de B:");
        d1.setB(scan.nextDouble());

        System.out.println("Escreva o valor de C:");
        d1.setC(scan.nextDouble());

        double delta = d1.calculaDelta();

        if (delta >= 0) {
            EqXn eq1 = new EqXn(d1.getA(), d1.getB(), d1.getC());

            System.out.println("Delta:" + delta);
            System.out.printf("Xn vale: %.1f%n", eq1.calculaXn(delta));
            System.out.printf("Xp vale: %.1f%n", eq1.calculaXp(delta));
        } else {
            System.out.println("Delta invalido");
        }

    }
}
