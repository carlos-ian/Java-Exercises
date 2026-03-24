package Laboratorios.Lab03;

import java.util.Scanner;

public class Product_Encapsulated {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Construtor 1
        System.out.println("--- Cadastro Produto 1 (Construtor) ---");
        Produto p1 = new Produto();

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

        p1.setProduto(nome1, qtd1, tipo1, valor1);

        // Construtor 2
        System.out.println("\n--- Cadastro Produto 2 (Construtor Código e Nome) ---");
        System.out.print("Nome: ");
        String nome2 = leitor.nextLine();

        Produto p2 = new Produto(nome2);

        // Construtor 3
        System.out.println("\n--- Cadastro Produto 3 (Código, Nome e Qtd) ---");
        System.out.print("Nome: ");
        String nome3 = leitor.nextLine();
        System.out.print("Quantidade: ");
        int qtd3 = leitor.nextInt();
        leitor.nextLine();

        Produto p3 = new Produto(nome3, qtd3);

        // Construtor 4
        System.out.println("\n--- Cadastro Produto 4 (Todos os dados) ---");
        System.out.print("Nome: ");
        String nome4 = leitor.nextLine();
        System.out.print("Quantidade: ");
        int qtd4 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Tipo: ");
        String tipo4 = leitor.nextLine();
        System.out.print("Valor: ");
        double valor4 = leitor.nextDouble();

        Produto p4 = new Produto(nome4, qtd4, tipo4, valor4);

        int menu = 0;
        while (menu != 6) {
            System.out.println("\n========== MENU DE OPERAÇÕES ==========");
            System.out.println("Qual produto deseja manipular?");
            System.out.println("1- P1 | 2- P2 | 3- P3 | 4- P4 | 5- Ver Todos | 6- Sair");
            System.out.print("Opção: ");
            menu = leitor.nextInt();

            if (menu >= 1 && menu <= 4) {
                Produto escolhido;
                if (menu == 1) escolhido = p1;
                else if (menu == 2) escolhido = p2;
                else if (menu == 3) escolhido = p3;
                else escolhido = p4;

                System.out.println("\nO que deseja fazer com " + escolhido.getNome() + "?");
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
                        escolhido.setQuantidadeVenda((leitor.nextInt()));
                        break;
                    case 2:
                        System.out.print("Qtd para acrescentar: ");
                        int qtd = leitor.nextInt();
                        escolhido.setQuantidade(qtd);
                        break;
                    case 3:
                        System.out.print("Quantidade para acrescentar: ");
                        int quantidade_acrescentar = leitor.nextInt();
                        System.out.print("Novo valor: ");
                        int novo_valor = leitor.nextInt();
                        escolhido.setQuantidade(quantidade_acrescentar, novo_valor);
                        break;
                    case 4:
                        System.out.println("ID: " + escolhido.getCodigo() + " | Nome: " + escolhido.getNome() + " | Tipo: " + escolhido.getTipo() + " | Qtd: " + escolhido.getQuantidade() + " | Valor: R$" + escolhido.getValor());
                        break;
                    case 5:
                        if (escolhido.igual(p1)) {
                            System.out.println("Resultado: O produto " + escolhido.getNome() + " é IGUAL ao P1.");
                        } else {
                            System.out.println("Resultado: Os produtos são DIFERENTES.");
                        }
                }
            } else if (menu == 5) {
                System.out.println("\n--- STATUS ATUAL ---");
                System.out.println("P1: " + "ID: " + p1.getCodigo() + " | Nome: " + p1.getNome() + " | Tipo: " + p1.getTipo() + " | Qtd: " + p1.getQuantidade() + " | Valor: R$" + p1.getValor());
                System.out.println("P2: " + "ID: " + p2.getCodigo() + " | Nome: " + p2.getNome() + " | Tipo: " + p2.getTipo() + " | Qtd: " + p2.getQuantidade() + " | Valor: R$" + p2.getValor());
                System.out.println("P3: " + "ID: " + p3.getCodigo() + " | Nome: " + p3.getNome() + " | Tipo: " + p3.getTipo() + " | Qtd: " + p3.getQuantidade() + " | Valor: R$" + p3.getValor());
                System.out.println("P4: " + "ID: " + p4.getCodigo() + " | Nome: " + p4.getNome() + " | Tipo: " + p4.getTipo() + " | Qtd: " + p4.getQuantidade() + " | Valor: R$" + p4.getValor());
            }
        }

        System.out.println("Sistema encerrado.");
        leitor.close();
    }
}

class Produto {
    private static int contador = 0;

    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    Produto() {
        this.codigo = ++contador;
    }

    Produto(String nome) {
        this.codigo = ++contador;
        this.nome = nome;
    }

    Produto(String nome, int quantidade) {
        this.codigo = ++contador;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(String nome, int quantidade, String tipo, double valor) {
        this.codigo = ++contador;
        this.nome = nome;this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public int getQuantidade() { return quantidade; }
    public double getValor() { return valor; }

    public void setQuantidadeVenda(int qtdvenda) {
        if (qtdvenda < this.quantidade) {
            this.quantidade -= qtdvenda;
            double total = this.quantidade * this.valor;
            System.out.println("Total de vendas: " + total);
        } else {
            System.out.println("Estoque insuficiente para essa venda");
        }
    }

    public void setQuantidade(int qtdcompra, int novo_valor) {
        this.quantidade += qtdcompra;
        this.valor = novo_valor;
        System.out.println("Estoque Atualizado: " + this.quantidade + " e Valor Alterado: " + this.valor);
    }

    public void setQuantidade(int qtdcompra) {
        this.quantidade += qtdcompra;
        System.out.println("Estoque Atualizado: " + this.quantidade);
    }

    public void setProduto(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outroProduto) {
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);
    }
}