package Lista_de_Exercícios_1.Robo;

import java.util.Scanner;

public class RoboPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Robo r1 = new Robo(1, 100);
        Robo r2 = new Robo(2, 200);

        String acao = "";
        while (!acao.equalsIgnoreCase("S")) {
            System.out.println("Qual robô será utilizado? Rôbo 1 (1) ou Rôbo 2 (2)");
            int robs = input.nextInt();
            input.nextLine();
            Robo escolhido;
            if (robs == 1) {escolhido = r1;}
            else {escolhido = r2;}

            System.out.println("O que deseja fazer? Ligar (L) | Desligar (D) | Andar (A) | Parar (P) | Aspirar (AP) | Mostrar Informações (I) | Sair (S)" );
            acao = input.nextLine().toUpperCase();

            switch (acao) {
                case "L":
                    escolhido.ligar();
                    break;
                case "D":
                    escolhido.desligar();
                    break;
                case "A":
                    System.out.println("Digite a quantidade de movimento em X e Y: ");
                    int x = input.nextInt();
                    input.nextLine();
                    int y = input.nextInt();
                    input.nextLine();
                    escolhido.andar(x, y);
                    break;
                case "P":
                    escolhido.parar();
                    break;
                case "AP":
                    System.out.println("Digite a quantidade a ser aspirada: ");
                    int quantidade = input.nextInt();
                    input.nextLine();
                    escolhido.aspirar(quantidade);
                    break;
                case "I":
                    System.out.println(escolhido);
            }
        }
    }
}
