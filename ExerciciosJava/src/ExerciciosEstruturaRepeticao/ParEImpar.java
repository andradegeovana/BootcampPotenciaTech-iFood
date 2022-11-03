package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {

//        Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares
//        e a quantidade de números impares.
        Scanner sc = new Scanner(System.in);

        int N, numero, contador = 0, par = 0, impar = 0;

        System.out.println("Quantos números você vai inserir? ");
        N = sc.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                par += 1;
            }
            else {
                impar += 1;
            }
            contador += 1;
        } while (contador < N);

        System.out.println(par + " pares e " + impar + " ímpares");
    }
}
