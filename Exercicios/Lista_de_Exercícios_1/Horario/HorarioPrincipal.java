package Lista_de_Exercícios_1.Horario;

import java.util.Scanner;

public class HorarioPrincipal {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Hora: ");
        int hora1 = sc.nextInt();

        System.out.println("Digite os Minutos: ");
        int minuto1 = sc.nextInt();

        System.out.println("Digite os Segundos: ");
        int segundo1 = sc.nextInt();
        Horario horario1 = new Horario(hora1, minuto1, segundo1);

        System.out.println("Digite a Hora: ");
        int hora2 = sc.nextInt();
        Horario horario2 = new Horario(hora2);


        System.out.println("Atualize a Hora: ");
        int horaNova = sc.nextInt();
        horario2.setHora(horaNova);

        System.out.println("Atualize os Minutos: ");
        int minutoNova = sc.nextInt();
        horario2.setMinuto(minutoNova);

        System.out.println("Atualize os Segundos: ");
        int segundoNova = sc.nextInt();
        horario2.setSegundo(segundoNova);

        System.out.println("Horário 1: " + horario1.getHorario());
        System.out.println("Horario 2: " + horario2.getHorario());

        System.out.println("Diferença em minutos: " + Horario.horarioDiferenca(horario1, horario2));
    }
}
