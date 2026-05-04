package Lista_de_Exercícios_2.Questão_1;

public class Comissionados extends Funcionario {
    private double salario;
    private int vendas;
    private double comissao;

    Comissionados(String nome, String sobrenome, double salario, int vendas, double comissao) {
        super(nome, sobrenome);
        this.salario = salario;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularGanhos() {
        return salario + (vendas * (comissao / 100));
    }

    public double getSalario() { return salario;}
    public int getVendas() { return vendas;}
    public double getComissao() { return comissao;}
    public void setSalario(double salario) { this.salario = salario; }
    public void setVendas(int vendas) { this.vendas = vendas; }
    public void setComissao(double comissao) { this.comissao = comissao; }
}
