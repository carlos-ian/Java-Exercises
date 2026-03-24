package Laboratorios.Lab02;

import java.util.Scanner;

public class Ex_001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double number = sc.nextDouble();
        sc.close();
        System.out.println(Math.ceil(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.round(number));
    }
}
