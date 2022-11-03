package ExerciciosArray;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {

//        Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
//        Imprima as consoantes.
        Scanner sc = new Scanner(System.in);

        String [] vet = new String[6];
        int i, vogal = 0, consoante = 0;

        for (i = 0; i < 6; i++) {
            System.out.println("VET[" + i + "]:");
            vet[i] = sc.next();
        }

        for (i = 0; i < 6; i++) {
            if (vet[i].equalsIgnoreCase("a") | vet[i].equalsIgnoreCase("e") |
                    vet[i].equalsIgnoreCase("i") | vet[i].equalsIgnoreCase("o") |
                    vet[i].equalsIgnoreCase("u")) {
                vogal += 1;
            }
            else {
                consoante += 1;
            }
        }

        System.out.println("Consoantes: " + consoante);

    }
}
