package Lista_de_Exercícios_1.TVControle;

import java.util.Scanner;

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        Scanner input = new Scanner(System.in);

        String acao = "I";
        while(acao != "S") {
            System.out.print("O que deseja fazer? Aumentar Volume (AV) | Diminuir Volume (DV) | Mudar Canal (MC) ");
            acao = input.nextLine();

            switch(acao) {
                case "AV":
                    System.out.println("Quanto deseja aumentar? ");
                    int aumento = input.nextInt();
                    input.nextLine();
                    televisao.aumentarVolume(aumento);
                    break;

                case "DV":
                    System.out.println("Quanto deseja diminuir? ");
                    int diminuir = input.nextInt();
                    input.nextLine();
                    televisao.diminuirVolume(diminuir);
                    break;

                case "MC":
                    System.out.println("Qual canal deseja ir? ");
                    int canal = input.nextInt();
                    input.nextLine();
                    televisao.setCanal(canal);
                    break;
            }

            System.out.println(televisao);
        }
    }
}
