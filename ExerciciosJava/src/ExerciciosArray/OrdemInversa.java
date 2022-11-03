package ExerciciosArray;

import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {

        //Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
        Scanner sc = new Scanner(System.in);

        int [] vet = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("VET[" + i + "]: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Vetor inverso:");
        for (i = vet.length - 1; i >= 0; i--) {
            System.out.print(vet[i] + " ");
        }
    }
}
