package Laboratorios.Lab11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;

public class Questao2_LerObjetos {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String arquivoBinario = "funcionarios.dat";

        double totalImpostoFeminino = 0;
        double totalImpostoMasculino = 0;

        System.out.println("--- RELAÇÃO DE FUNCIONÁRIOS (Do Arquivo Serializado) ---");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivoBinario))) {
            List<Funcionario> listaFuncionarios = (List<Funcionario>) ois.readObject();

            for (Funcionario func : listaFuncionarios) {
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

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler o arquivo serializado: " + e.getMessage());
        }
    }
}