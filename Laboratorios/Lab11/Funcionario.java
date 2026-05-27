package Laboratorios.Lab11;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    String nome;
    char sexo;
    double salario;
    int dependentes;

    Funcionario(String nome, char sexo, double salario, int dependentes) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public double impostoRenda() {
        double reducaoDep = 189.59 * dependentes;
        double imposto;

        if (salario <= 1903.98)
        imposto = 0;
        else if (salario <= 2826.65)
        imposto = (salario * 7.5 / 100 - 142.80) - reducaoDep;
        else if (salario <= 3751.05)
        imposto = (salario * 15 / 100 - 354.80) - reducaoDep;
        else if (salario <= 4664.68)
        imposto = (salario * 22.5 / 100 - 636.13) - reducaoDep;
        else
        imposto = ((salario * 27.5 / 100) - 869.36) - reducaoDep;

        return Math.max(0, imposto);
    }

    public String mostraFuncionario() {
        return String.format("Nome: %-15s | Sexo: %s | Salário: R$ %7.2f | Dependentes: %d | IR: R$ %7.2f",
                nome, sexo, salario, dependentes, impostoRenda());
    }
}
