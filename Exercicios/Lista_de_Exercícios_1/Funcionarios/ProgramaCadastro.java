package Lista_de_Exercícios_1.Funcionarios;

public class ProgramaCadastro {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("12.345.678/0001-99", "Tech Solutions");

        for (int i = 1; i <= 5; i++) {
            minhaEmpresa.adicionarFuncionario(new Funcionario("Funci " + i, "100" + i, 2000));
        }

        minhaEmpresa.adicionarFuncionario(new Gerente("Gerente A", "201", 5000, 1234, 1000));
        minhaEmpresa.adicionarFuncionario(new Gerente("Gerente B", "202", 5500, 4321, 1200));

        double[] vendasExemplo = {10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000};
        for (int i = 1; i <= 5; i++) {
            minhaEmpresa.adicionarFuncionario(new Vendedor("Vendedor " + i, "300" + i, 1500, 5.0, vendasExemplo));
        }

        System.out.println("SITUAÇÃO INICIAL:");
        minhaEmpresa.mostrarFuncionarios();

        System.out.println("\n>>> Aplicando aumento de 10% a todos...");
        for (Funcionario f : minhaEmpresa.getFuncionarios()) {
            f.aumentarSalario(10);
        }

        System.out.println("\nSITUAÇÃO APÓS AUMENTO:");
        minhaEmpresa.mostrarFuncionarios();
    }
}