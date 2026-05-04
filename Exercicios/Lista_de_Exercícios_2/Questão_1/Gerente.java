package Lista_de_Exercícios_2.Questão_1;

public class Gerente extends Funcionario {
    private double salarioBase;
    private double bonificacao;

    Gerente(String nome, String sobrenome, double salarioBase, double bonificacao) {
        super(nome, sobrenome);
        this.salarioBase = salarioBase;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularGanhos() {
        return this.salarioBase + this.bonificacao;
    }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public double getBonificacao() { return bonificacao; }
    public void setBonificacao(double bonificacao) { this.bonificacao = bonificacao; }
}

