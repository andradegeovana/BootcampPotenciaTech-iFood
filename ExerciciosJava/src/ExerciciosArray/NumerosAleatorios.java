package ExerciciosArray;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

//        Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final,
//        mostre os números e seus sucessores.

        Random numero = new Random();
        int[] vet = new int[20];
        int i;

        for (i = 0; i < 20; i++) {
            vet[i] = numero.nextInt(100);
            System.out.println("VET[" + i + "]: " + vet[i] + "       Sucessor: " + (vet[i] + 1));
        }
    }
}
