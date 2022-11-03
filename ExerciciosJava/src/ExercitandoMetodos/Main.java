package ExercitandoMetodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao, calculadora, horario, parcelas;
        double numero1, numero2, valor;

        System.out.println("Escolha uma opção: ");
        System.out.println("1- Calculadora");
        System.out.println("2- Horário");
        System.out.println("3- Empréstimo");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O que você deseja fazer? ");
                System.out.println("1- Somar");
                System.out.println("2- Subtrair");
                System.out.println("3- Multiplicar");
                System.out.println("4- Dividir");
                calculadora = sc.nextInt();

                System.out.println("Número 1: ");
                numero1 = sc.nextDouble();
                System.out.println("Número 2: ");
                numero2 = sc.nextDouble();

                switch (calculadora) {
                    case 1:
                        Calculadora.somar(numero1, numero2);
                        break;
                    case 2:
                        Calculadora.subtrair(numero1, numero2);
                        break;
                    case 3:
                        Calculadora.multiplicar(numero1, numero2);
                        break;
                    case 4:
                        Calculadora.dividir(numero1, numero2);
                        break;
                }
                break;

            case 2:
                System.out.println("Horário: ");
                horario = sc.nextInt();

                Horario.mensagemHorario(horario);
                break;

            case 3:
                System.out.println("Valor do empréstimo: ");
                valor = sc.nextDouble();
                System.out.println("Quantidade de parcelas: ");
                parcelas = sc.nextInt();

                Emprestimo.valorFinal(valor, parcelas);
        }
    }
}
