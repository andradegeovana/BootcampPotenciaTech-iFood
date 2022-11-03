package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

//        Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//        Ex.: 5!=5.4.3.2.1=120
        Scanner sc = new Scanner(System.in);

        int fatorial, i, mult = 1;

        System.out.println("Fatorial: ");
        fatorial = sc.nextInt();

        for (i = fatorial; i > 0; i--) {
            mult = i * mult;
            System.out.println("Resultado: " + mult);
        }

    }
}
