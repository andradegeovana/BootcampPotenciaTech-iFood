package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
//        Faça um programa que leia 5 números e informe o maior número e a média desses números.

        Scanner sc = new Scanner(System.in);

        int numero, maior = 0, contador = 0;
        double media, soma = 0;

        do {
            System.out.println("Número:");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            contador += 1;
            soma += numero;
            //System.out.println("Soma " + soma);
        } while (contador < 5);

        media = soma / 5;
        System.out.println("O maior número é " + maior);
        System.out.println("A média é " + media);

    }
}
