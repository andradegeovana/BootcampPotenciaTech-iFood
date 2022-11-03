package ExercitandoMetodos;

public class Calculadora {

    // calcular soma, subtração, multiplicação e divisao utilizando 2 paramentros de valor

    public static void somar(double numero1, double numero2) {

        double soma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + soma);

    }

    public static void subtrair(double numero1, double numero2) {

        double subtracao = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + subtracao);

    }

    public static void multiplicar(double numero1, double numero2) {

        double multiplicacao = numero1 * numero2;
        System.out.println(numero1 + " x " + numero2 + " = " + multiplicacao);

    }

    public static void dividir(double numero1, double numero2) {

        double divisao = numero1 / numero2;
        System.out.println(numero1 + " ÷ " + numero2 + " = " + divisao);

    }
}
