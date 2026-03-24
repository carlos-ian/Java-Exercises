package Laboratorios.Lab01;
/*
Enunciado: Um programa que receba 3 números (X,Y e Z) do usuário e mostre-os em ordem crescente.
 */

import java.util.Scanner;

public class Ex_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int bigger, medium, smaller;
        int size = 2;
        for (int i = 0; i <= size; i++) {
            System.out.println("Digite o " + (i+1) + "o Número: ");
            int number = sc.nextInt();
            sc.nextLine();
            arr[i] = number;
        }
        if (arr[0] > arr[1] && arr[0] > arr[2]) {
            bigger = arr[0];
            if (arr[1] > arr[2]) {
                medium = arr[1];
                smaller = arr[2];
            } else {
                medium = arr[2];
                smaller = arr[1];
            }
        } else if (arr[1] > arr[2] && arr[1] > arr[0]) {
            bigger = arr[1];
            if (arr[0] > arr[2]) {
                medium = arr[0];
                smaller = arr[2];
            } else {
                medium = arr[2];
                smaller = arr[0];
            }
        } else {
            bigger = arr[2];
            if (arr[0] > arr[1]) {
                medium = arr[0];
                smaller = arr[1];
            } else {
                medium = arr[1];
                smaller = arr[0];
            }
        }
        sc.close();
        System.out.println(bigger + " > " + medium + " > " + smaller);
    }
}