package Lista_de_Exercícios_2.Questão_1;

public class Principal {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Horistas("João", "Silva", 160, 25.0);
        funcionarios[1] = new Horistas("Ana", "Costa", 170, 30.0);

        funcionarios[2] = new Administrador("Carlos", "Oliveira", 4500.0);
        funcionarios[3] = new Administrador("Beatriz", "Souza", 4200.0);
        funcionarios[4] = new Administrador("Marcos", "Pereira", 4800.0);
        funcionarios[5] = new Administrador("Julia", "Lima", 4100.0);

        funcionarios[6] = new Comissionados("Roberto", "Santos", 2000.0, 50000, 5.0);
        funcionarios[7] = new Comissionados("Fernanda", "Alves", 1800.0, 30000, 4.0);
        funcionarios[8] = new Comissionados("Ricardo", "Melo", 2200.0, 80000, 6.0);

        funcionarios[9] = new Gerente("Patrícia", "Nunes", 8000.0, 2500.0);

        System.out.println("--- RELATÓRIO DE PAGAMENTOS ---");
        for (Funcionario f : funcionarios) {
            f.mostrarDados();
            System.out.println("-------------------------------");
        }
    }
}
