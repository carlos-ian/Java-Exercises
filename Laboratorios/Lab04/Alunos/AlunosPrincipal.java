package Laboratorios.Lab04.Alunos;

public class AlunosPrincipal {
    public static void main(String[] args) {
        Departamento dptoInf = new Departamento("Instituto de Informática", "INF");

        Curso cursoES = new Curso("Engenharia de Software", "BES", dptoInf);
        Curso cursoCC = new Curso("Ciência da Computação", "BCC", dptoInf);

        Aluno aluno1 = new Aluno("Ian Carlos", 2025, 2023001, cursoES);
        Aluno aluno2 = new Aluno("Bruno Souza", 2023, 2023002, cursoCC);

        System.out.println("--- REGISTROS ACADÊMICOS ---\n");
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}