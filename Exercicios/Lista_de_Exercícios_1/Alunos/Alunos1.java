package Lista_de_Exercícios_1.Alunos;

import java.util.Scanner;

public class Alunos1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome =  leitor.nextLine();
        Aluno a1 = new Aluno(nome);

        System.out.print("Digite a matrícula do aluno: ");
        int matricula =  leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o ano: ");
        int ano =  leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso =  leitor.nextLine();

        a1.matricular(matricula, curso, ano);

        System.out.println(a1);

        System.out.println("Digite o curso alterado: ");
        String outro_curso =  leitor.nextLine();
        a1.setCurso(outro_curso);

        System.out.println("Digite ano alterado: ");
        int outro_ano =  leitor.nextInt();
        leitor.nextLine();
        a1.setAno(outro_ano);

        System.out.println(a1);
    }
}

class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private String curso;
    Aluno (String nome) {
        this.nome = nome;
    }
    public void matricular (int matricula, String curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }
    public String toString() {
        return "Aluno : "+ nome + " - matricula : " + matricula + " - Curso : " + curso + " - " + ano;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}