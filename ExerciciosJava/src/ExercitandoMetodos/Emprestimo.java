package ExercitandoMetodos;

public class Emprestimo {
    //Calcule o valor final do emprestimo a partir do valor solicitado. Taxas e parcelas influenciam. Defina
    //arbitrariamente as faixas que influenciam nos valores.

    public static double taxaParcelas(int parcelas) {

        double taxa;

        if (parcelas > 0 && parcelas <= 10) {
            taxa = 10;
        }
        else if (parcelas <= 20) {
            taxa = 17.5;
        }
        else {
            taxa = 30;
        }
        return taxa;
    }

    public static void valorFinal(double valor, int parcelas) {
        double emprestimo;
        emprestimo = valor + (valor * (taxaParcelas(parcelas) / 100));
        System.out.println("O valor final é de R$ " + emprestimo);
    }
}
