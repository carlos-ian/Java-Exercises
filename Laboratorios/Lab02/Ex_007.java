package Laboratorios.Lab02;

import java.util.Scanner;

public class Ex_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de funcionários: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        String[] names = new String[quantity];
        int[] salaries = new int[quantity];
        int sum = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite o nome: ");
            names[i] = sc.nextLine();
            System.out.println("Digite o salário: ");
            salaries[i] = sc.nextInt();
            sc.nextLine();
            sum = sum + salaries[i];
        }
        int average = sum / quantity;
        int max = Max(salaries);
        int min = Min(salaries);
        System.out.println("Maior Salário: " + salaries[max] + " de " +  names[max] + " na posição " + max);
        System.out.println("Menor Salário: " + salaries[min] + " de " +  names[min] + " na posição " + min);
        System.out.println("Média Salarial: " + average);

        System.out.println();

        System.out.println("Maiores que a Média: ");
        for (int i = 0; i < quantity; i++) {
            if (salaries[i] > average) {
                System.out.println(salaries[i] + " de " + names[i]);
            }
        }
        System.out.println();

        System.out.println("Menores que a Média: ");
        for (int i = 0; i < quantity; i++) {
            if (salaries[i] <= average) {
                System.out.println(salaries[i] + " de " + names[i]);
            }
        }
    }

    public static int Max(int[] salaries){
        int size = salaries.length;

        int max = 0;
        for (int j = 1; j < size - 1; j++) {
            if (salaries[j] > salaries[max]) {
                max = j;
            }
        }
        return max;
    }

    public static int Min(int[] salaries){
        int size = salaries.length;

        int min = 0;
        for (int j = 1; j < size - 1; j++) {
            if (salaries[j] < salaries[min]) {
                min = j;
            }
        }
        return min;
    }
}
