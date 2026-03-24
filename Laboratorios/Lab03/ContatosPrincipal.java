package Laboratorios.Lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatosPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Contato> listaDeContatos = new ArrayList<>();
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Nome: ");
            String nome = leitor.nextLine();

            System.out.print("Setor: ");
            String setor = leitor.nextLine();

            System.out.print("E-mail: ");
            String email = leitor.nextLine();

            System.out.print("Telefone: ");
            String telefone = leitor.nextLine();

            System.out.print("ID: ");
            int id = leitor.nextInt();

            System.out.print("Salário: ");
            double salario = leitor.nextDouble();

            System.out.print("Ativo (true/false): ");
            boolean ativo = leitor.nextBoolean();

            leitor.nextLine();

            listaDeContatos.add(new Contato(nome, id, setor, email, telefone, ativo, salario));

            System.out.print("Continuar? (s/n): ");
        }

        for (Contato c : listaDeContatos) {
            System.out.println(c);
        }

        leitor.close();
    }
}

class Contato {
    private String nome;
    private int id;
    private String setor;
    private String email;
    private String telefone;
    private boolean ativo;
    private double salario;

    Contato(String nome, int id, String setor, String email,String telefone, boolean ativo, double salario) {
        this.nome = nome;
        this.id = id;
        this.setor = setor;
        this.email = email;
        this.telefone = telefone;
        this.ativo = true;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "========== FICHA DE CONTATO ==========\n" +
                "ID:        " + id + (ativo ? " [ATIVO]" : " [INATIVO]") + "\n" +
                "Nome:      " + nome + "\n" +
                "Setor:     " + setor + "\n" +
                "E-mail:    " + email + "\n" +
                "Telefone:  " + telefone + "\n" +
                "Salário:   R$ " + salario + "\n" +
                "======================================";
    }
}