package Laboratorios.Lab02;

import java.util.Scanner;

public class Ex_006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        if (validarNome(nome)) {
            System.out.println("Nome válido!");
        } else {
            System.out.println("Nome inválido! Use apenas letras.");
        }

        System.out.print("Digite o telefone: ");
        String telefone = sc.nextLine();

        if (validarTelefone(telefone)) {
            System.out.println("Telefone válido!");
        } else {
            System.out.println("Telefone inválido! Use apenas números.");
        }
        sc.close();
    }

    public static boolean validarNome(String texto) {
        if (texto.isEmpty())
            return false;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean validarTelefone(String texto) {
        if (texto.isEmpty()) return false;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}