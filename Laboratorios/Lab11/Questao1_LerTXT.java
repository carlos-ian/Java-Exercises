package Laboratorios.Lab11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao1_LerTXT {
    public static void main(String[] args) {
        String caminhoArquivo = "funcionarios.txt";

        double totalImpostoFeminino = 0;
        double totalImpostoMasculino = 0;

        System.out.println("--- RELAÇÃO DE FUNCIONÁRIOS (Do Arquivo TXT) ---");
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");

                String nome = campos[0];
                char sexo = campos[1].toUpperCase().charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario func = new Funcionario(nome, sexo, salario, dependentes);
                System.out.println(func.mostraFuncionario());

                double imposto = func.impostoRenda();
                if (func.sexo == 'F') {
                    totalImpostoFeminino += imposto;
                } else if (func.sexo == 'M') {
                    totalImpostoMasculino += imposto;
                }
            }

            double totalGeral = totalImpostoFeminino + totalImpostoMasculino;

            System.out.println("\n------------------------------------------------");
            System.out.printf("Total IR Pago por Mulheres (F): R$ %.2f\n", totalImpostoFeminino);
            System.out.printf("Total IR Pago por Homens (M)  : R$ %.2f\n", totalImpostoMasculino);
            System.out.printf("Total Geral de IR Pago        : R$ %.2f\n", totalGeral);
            System.out.println("------------------------------------------------");

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro no processamento dos dados: " + e.getMessage());
        }
    }
}