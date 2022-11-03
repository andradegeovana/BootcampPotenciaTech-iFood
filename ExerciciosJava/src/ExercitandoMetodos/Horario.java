package ExercitandoMetodos;

public class Horario {

    //A partir da hora do dia, informe a mensagem adequada: Bom dia, boa tarde ou boa noite

    public static void mensagemHorario(int horario) {

        if (horario >= 0 && horario < 12) {
            System.out.println("Bom dia! ");
        }
        else if (horario < 19) {
            System.out.println("Boa tarde! ");
        }
        else {
            System.out.println("Boa noite! ");
        }

    }
}
