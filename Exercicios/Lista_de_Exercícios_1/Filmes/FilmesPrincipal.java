package Lista_de_Exercícios_1.Filmes;
import java.util.Scanner;

public class FilmesPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        while(true){
            System.out.println("\nDigite um código: (0 para encerrar) ");
            codigo = sc.nextInt();
            sc.nextLine();

            if (codigo == 0) {
                break;
            }

            System.out.println("Digite o nome do Filme: ");
            String nome = sc.nextLine();

            System.out.println("Adicionado Filme...");
            Filme novoFilme = new Filme(codigo, nome);

            System.out.println("--- Atualizando outros dados ---");
            System.out.println("Digite o gênero: ");
            String genero = sc.nextLine();
            novoFilme.setGenero(genero);

            System.out.println("Digete o ano de lançamento: ");
            int ano = sc.nextInt();
            sc.nextLine();
            novoFilme.setAno(ano);

            System.out.println("Digete o autor do filme: ");
            String autor = sc.nextLine();
            novoFilme.setAutor(autor);

            System.out.println("--- Dados do Filme ---");
            System.out.println(novoFilme);
            System.out.println("Filmes criados: " + Filme.getNumero_filmes());
        }

    sc.close();
    }
}
