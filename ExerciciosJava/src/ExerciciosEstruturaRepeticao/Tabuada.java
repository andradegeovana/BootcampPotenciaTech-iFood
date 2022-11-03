package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

//        Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário
//        deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
        Scanner sc = new Scanner(System.in);

        int tabuada, i, mult;

        System.out.println("Qual tabuada você quer?");
        tabuada = sc.nextInt();

        for (i = 0; i <= 10; i++) {
            mult = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + mult);
        }

    }
}
