package Laboratorios.Lab01;
/*
Enunciado: Um programa que receba a quantidade (X) de alunos de uma turma e após informada a
quantidade, solicite que o usuário entre com o nome e a matrícula de cada um dos X alunos. O
programa deverá utilizar um String chamado lista onde irá concatenar cada matrícula e nome
como uma linha e ao final mostrar todos os alunos digitados. (concatenar com o \n – para pular
linha)
 */

import java.util.Scanner;

public class Ex_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de alunos: ");
        int student_number = sc.nextInt();
        sc.nextLine();
        String list = "Lista de Alunos:\n";
        for (int i = 1; i <= student_number; i++) {
            System.out.println("Digite o nome do aluno: ");
            String student_name = sc.nextLine();
            System.out.println("Digite a matrícula do aluno: ");
            int student_registration = sc.nextInt();
            sc.nextLine();
            list = list + student_name + " " + student_registration + "\n";
        }
        sc.close();
        System.out.println(list);
    }
}
