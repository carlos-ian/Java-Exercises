package Lista_de_Exercícios_1.Funcionarios;

public class Vendedor extends Funcionario {
    private double[] vendasMes = new double[12];
    private double percentualComissao;

    public Vendedor(String nome, String cpf, double salario, double percentualComissao, double[] vendas) {
        super(nome, cpf, salario);
        this.percentualComissao = percentualComissao;
        this.vendasMes = vendas;
    }

    @Override
    public double calcularProventosAnuais() {
        double totalComissao = 0;
        for (double venda : vendasMes) {
            totalComissao += venda * (percentualComissao / 100);
        }
        return (this.salario * 12) + totalComissao;
    }

}
