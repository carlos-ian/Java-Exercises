package Laboratorios.Lab02;

import java.util.Scanner;

public class Ex_005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Digite o " + (i+1) + "o Elemento: ");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        BubbleSort(arr);
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        while (size > 0) {
            System.out.print(arr[size-1] + " ");
            size--;
        }
        System.out.println();
        System.out.println("Digite o Número Alvo: ");
        int target = sc.nextInt();
        int index = BinarySearch(arr, target);
        if (index == -1) {
            System.out.println("Elemento não encontrado");
        } else {
            System.out.println("Elemento encontrado na posição " + index);
        }
    }

    public static void BubbleSort(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}