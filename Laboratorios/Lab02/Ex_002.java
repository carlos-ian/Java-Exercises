package Laboratorios.Lab02;

import java.util.Scanner;

public class Ex_002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number_one = sc.nextInt();
        System.out.println("Digite outro número: ");
        int number_two = sc.nextInt();
        sc.close();
        if (number_one > number_two) {
            System.out.println(number_one + " > " + number_two);
        } else {
            System.out.println(number_two + " > " + number_one);
        }
    }
}
