package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
//        Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
//    continue pedindo até que o usuário informe um valor válido.

        Scanner sc = new Scanner(System.in);

        double nota = 0;


        System.out.println("Digite uma nota entre 0 e 10");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, tente novamente");
            nota = sc.nextDouble();
        }
    }
}
