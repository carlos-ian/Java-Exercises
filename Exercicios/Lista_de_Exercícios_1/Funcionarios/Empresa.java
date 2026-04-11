package Lista_de_Exercícios_1.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }

    public void mostrarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários: " + this.nome + " ---");
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString() + " | Proventos Anuais: R$ " + f.calcularProventosAnuais());
        }
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}