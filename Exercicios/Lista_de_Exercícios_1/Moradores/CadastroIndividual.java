package Lista_de_Exercícios_1.Moradores;

import java.util.Scanner;

public class CadastroIndividual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("=== Novo Cadastro de Morador ===");
            System.out.print("Nome: "); String nome = sc.nextLine();
            System.out.print("CPF: "); String cpf = sc.nextLine();
            System.out.print("Celular: "); String celular = sc.nextLine();
            System.out.print("Data de Nascimento: "); String data = sc.nextLine();
            System.out.print("Sexo: "); String sexo = sc.nextLine();
            System.out.print("Bloco: "); int bloco = sc.nextInt(); sc.nextLine();
            System.out.print("Apartamento: "); int apto = sc.nextInt(); sc.nextLine();
            System.out.print("Código de Acesso: "); int acesso = sc.nextInt(); sc.nextLine();

            Morador m = new Morador(nome, cpf, celular, data, sexo, bloco, apto, acesso);

            System.out.println("\nMorador cadastrado com sucesso!");
            m.mostrarMorador();

            System.out.print("Deseja cadastrar outro morador? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

        } while (continuar == 'S');

        sc.close();
    }
}