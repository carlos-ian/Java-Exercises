package Lista_de_Exercícios_1.Funcionarios;

public class Gerente extends Funcionario{
    private int senha;
    private double bonificacao;

    Gerente(String nome, String cpf, double salario, int senha, double bonificacao){
        super(nome, cpf, salario);
        this.senha = senha;
        this.bonificacao = salario;
    }

    public int getSenha() { return senha; }
    public void setSenha(int senha) { this.senha = senha; }

    @Override
    public double calcularProventosAnuais() {
        return (this.salario + this.bonificacao) * 12;
    }

    public double bonificacao(){
        double b = salario * 0.15;
        return b;
    }
}
