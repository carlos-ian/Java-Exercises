package Lista_de_Exercícios_1.Funcionarios;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalario() { return salario; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setSalario() { this.salario = salario; }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public double calcularProventosAnuais() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Salário: R$ %.2f", nome, cpf, salario);
    }

    public double bonificacao(){
        double b = salario * 0.10;
        return b;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
