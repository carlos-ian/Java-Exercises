package Laboratorios.Lab03;

import java.util.Scanner;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Construtor 1
        System.out.println("--- Cadastro Produto 1 (Construtor Código) ---");
        System.out.print("Digite o código: ");
        int cod1 = leitor.nextInt();
        leitor.nextLine();

        ProdutoAntigo p1 = new ProdutoAntigo(cod1);

        System.out.println("Agora, insira os demais dados para o Produto 1:");
        System.out.print("Nome: ");
        String nome1 = leitor.nextLine();
        System.out.print("Quantidade: ");
        int qtd1 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Tipo: ");
        String tipo1 = leitor.nextLine();
        System.out.print("Valor: ");
        double valor1 = leitor.nextDouble();
        leitor.nextLine();

        p1.inserir(nome1, qtd1, tipo1, valor1);

        // Construtor 2
        System.out.println("\n--- Cadastro Produto 2 (Construtor Código e Nome) ---");
        System.out.print("Código: ");
        int cod2 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Nome: ");
        String nome2 = leitor.nextLine();

        ProdutoAntigo p2 = new ProdutoAntigo(cod2, nome2);
        // Construtor 3
        System.out.println("\n--- Cadastro Produto 3 (Código, Nome e Qtd) ---");
        System.out.print("Código: ");
        int cod3 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Nome: ");
        String nome3 = leitor.nextLine();
        System.out.print("Quantidade: ");
        int qtd3 = leitor.nextInt();
        leitor.nextLine();

        ProdutoAntigo p3 = new ProdutoAntigo(cod3, nome3, qtd3);

        // Construtor 4
        System.out.println("\n--- Cadastro Produto 4 (Todos os dados) ---");
        System.out.print("Código: ");
        int cod4 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Nome: ");
        String nome4 = leitor.nextLine();
        System.out.print("Quantidade: ");
        int qtd4 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Tipo: ");
        String tipo4 = leitor.nextLine();
        System.out.print("Valor: ");
        double valor4 = leitor.nextDouble();

        ProdutoAntigo p4 = new ProdutoAntigo(cod4, nome4, qtd4, tipo4, valor4);

        int menu = 0;
        while (menu != 6) {
            System.out.println("\n========== MENU DE OPERAÇÕES (VERSÃO ANTIGA) ==========");
            System.out.println("Qual produto deseja manipular?");
            System.out.println("1- P1 | 2- P2 | 3- P3 | 4- P4 | 5- Ver Todos | 6- Sair");
            System.out.print("Opção: ");
            menu = leitor.nextInt();

            if (menu >= 1 && menu <= 4) {
                ProdutoAntigo escolhido;
                if (menu == 1) escolhido = p1;
                else if (menu == 2) escolhido = p2;
                else if (menu == 3) escolhido = p3;
                else escolhido = p4;

                System.out.println("\nO que deseja fazer com " + escolhido.nome + "?");
                System.out.println("1- Vender");
                System.out.println("2- Comprar");
                System.out.println("3- Comprar e Alterar Valor");
                System.out.println("4- Consultar");
                System.out.println("5- Comparar com P1");
                System.out.print("Escolha: ");
                int acao = leitor.nextInt();

                switch (acao) {
                    case 1:
                        System.out.print("Qtd para venda: ");
                        escolhido.vender(leitor.nextInt());
                        break;
                    case 2:
                        System.out.print("Qtd para acrescentar: ");
                        escolhido.comprar(leitor.nextInt());
                        break;
                    case 3:
                        System.out.print("Quantidade para acrescentar: ");
                        int quantidade_acrescentar = leitor.nextInt();
                        System.out.print("Novo valor: ");
                        int novo_valor = leitor.nextInt();
                        escolhido.comprar(quantidade_acrescentar, novo_valor);
                        break;
                    case 4:
                        System.out.println(escolhido);
                        break;
                    case 5:
                        if (escolhido.igual(p1)) {
                            System.out.println("Resultado: O produto " + escolhido.nome + " é IGUAL ao P1.");
                        } else {
                            System.out.println("Resultado: Os produtos são DIFERENTES.");
                        }
                }
            } else if (menu == 5) {
                System.out.println("\n--- STATUS ATUAL ---");
                System.out.println("P1: " + p1);
                System.out.println("P2: " + p2);
                System.out.println("P3: " + p3);
                System.out.println("P4: " + p4);
            }
        }

        System.out.println("Sistema encerrado.");
        leitor.close();
    }
}

class ProdutoAntigo {
    int codigo;
    String nome;
    int quantidade;
    String tipo;
    double valor;

    ProdutoAntigo(int codigo) {
        this.codigo = codigo;
    }

    ProdutoAntigo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    ProdutoAntigo(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    ProdutoAntigo(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int qtdvenda) {
        if (qtdvenda < this.quantidade) {
            this.quantidade -= qtdvenda;
            double total = (qtdvenda * this.valor);
            System.out.println("Total de vendas: " + total);
        } else {
            System.out.println("Estoque insuficiente para essa venda");
        }
    }

    public void comprar(int qtdcompra, int novo_valor) {
        this.quantidade += qtdcompra;
        this.valor = novo_valor;
        System.out.println("Estoque Atualizado: " + this.quantidade + " e Valor Alterado: " + this.valor);
    }

    public void comprar(int qtdcompra) {
        this.quantidade += qtdcompra;
        System.out.println("Estoque Atualizado: " + this.quantidade);
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(ProdutoAntigo outroProduto) {
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);
    }

    @Override
    public String toString() {
        return "ID: " + codigo + " | Nome: " + nome + " | Qtd: " + quantidade + " | Valor: R$" + valor;
    }
}