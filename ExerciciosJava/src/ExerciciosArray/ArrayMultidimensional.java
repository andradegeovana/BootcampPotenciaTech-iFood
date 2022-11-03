package ExerciciosArray;

import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {

//        Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da
//        matriz e a sua posição(linha, coluna)

        Random numero = new Random();
        int[][] matriz = new int[4][4];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = numero.nextInt(9);
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
