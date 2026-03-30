package Lista_de_Exercícios_1.Livros;

import java.util.Scanner;
import java.util.ArrayList;

public class LivroPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        while (true) {
            System.out.println("Digite um código: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            if (codigo == 0) {
                break;
            }

            System.out.println("Nome do Autor: ");
            String nome = sc.nextLine();
            System.out.println("Nome Intermediário do Autor: ");
            String nomeIntermediario = sc.nextLine();
            System.out.println("Sobrenome do Autor: ");
            String sobrenome = sc.nextLine();

            Pessoa autor = new Pessoa(nome, nomeIntermediario, sobrenome);

            System.out.println("Título: ");
            String titulo = sc.nextLine();
            System.out.println("Editora: ");
            String editora = sc.nextLine();
            System.out.println("Edição: ");
            int edicao = sc.nextInt();
            sc.nextLine();
            System.out.println("Ano: ");
            int ano = sc.nextInt();
            sc.nextLine();
            System.out.println("Local: ");
            String local = sc.nextLine();
            System.out.println("Gênero: ");
            String genero = sc.nextLine();

            Livro novoLivro = new Livro(titulo, codigo, autor, editora, edicao, ano, local, genero);
            livros.add(novoLivro);
        }

        System.out.println("--- Lista de Livros ---");
        for (Livro livro : livros) {
            System.out.println(livro.mostrarLivro());
        }

        System.out.println("Número de Livros: " + Livro.getNumeroLivros() + "\n");
        System.out.println("Quantidade por Gênero: ");
        Livro.imprimirGeneros();

        sc.close();
    }
}