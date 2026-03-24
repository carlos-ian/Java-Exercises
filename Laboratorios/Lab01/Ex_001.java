package Laboratorios.Lab01;

/*
Enunciado: Um programa que recebe dois números (inicial e final) e mostre: a quantidade de números
inteiros dentro do intervalo, a soma, a média deles, e a quantidade de números pares.
 */
import java.util.Scanner;

public class Ex_001 {
      static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Digite o número inicial: ");
          int start_number = sc.nextInt();
          System.out.println("Digete o número final: ");
          int final_number = sc.nextInt();

          int sum = 0;
          int range_quantity = 0;
          int range_pairs = 0;
          for (int i = start_number; i <= final_number; i++ ) {
              range_quantity++;
              sum = sum + i;
              if (i % 2 == 0) {
                  range_pairs++;
              }

          }
          int average = sum / range_quantity;
          System.out.println("Números no Intervalo: " + range_quantity);
          System.out.println("Soma dos Números: " + sum);
          System.out.println("Média dos Números: " + average);
          System.out.println("Quantidade de Números Pares no Intervalo: " + range_pairs);
      }
}