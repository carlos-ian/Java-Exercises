package Lista_de_Exercícios_2.Questão_1;

public class Administrador extends Funcionario {
    private double salario;

    Administrador(String nome, String sobrenome, double salario) {
        super(nome, sobrenome);
        this.salario = salario;
    }

    @Override
    public double calcularGanhos() {
        return this.salario;
    }

    public double getSalarioMensal() { return salario; }
    public void setSalarioMensal(double salarioMensal) { this.salario = salarioMensal; }
}
