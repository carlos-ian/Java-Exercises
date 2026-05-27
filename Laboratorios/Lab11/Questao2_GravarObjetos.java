package Laboratorios.Lab11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Questao2_GravarObjetos {
    public static void main(String[] args) {
        String arquivoTxt = "funcionarios.txt";
        String arquivoBinario = "funcionarios.dat";
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoTxt))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].toUpperCase().charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                listaFuncionarios.add(new Funcionario(nome, sexo, salario, dependentes));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o TXT: " + e.getMessage());
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoBinario))) {
            oos.writeObject(listaFuncionarios);
            System.out.println("Objetos serializados com sucesso em '" + arquivoBinario + "'!");
        } catch (IOException e) {
            System.err.println("Erro ao serializar objetos: " + e.getMessage());
        }
    }
}