package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {
        //    Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo
//    representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)

        Scanner sc = new Scanner(System.in);

        int idade;
        String nome = "";

        while (true) {
            System.out.println("Digite o nome: ");
            nome = sc.next();
            if (nome.equals("0")) {
                break;
            }
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
        }
    }
}
