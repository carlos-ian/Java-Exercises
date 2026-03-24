package Laboratorios.Lab02;

import java.util.Scanner;

public class Ex_004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] reverse_arr = new int[10];
        int[] squared_arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "o Elemento: ");
            arr[i] = sc.nextInt();
            sc.nextLine();
            sum = sum + arr[i];
            reverse_arr[9-i] = arr[i];
            squared_arr[i] = arr[i] * arr[i];
        }
        int average = sum / 10;
        System.out.println("Soma dos Elementos " + sum);
        System.out.println("Média dos Elementos: " + average);
        for (int i = 0; i < reverse_arr.length; i++) {
            System.out.print(reverse_arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < squared_arr.length; i++) {
            System.out.print(squared_arr[i] + " ");
        }
    }
}