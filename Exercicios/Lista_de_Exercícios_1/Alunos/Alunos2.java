package Lista_de_Exercícios_1.Alunos;

import java.util.Scanner;

public class Alunos2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome =  leitor.nextLine();
        Aluno2 a1 = new Aluno2(nome);

        System.out.print("Digite a matrícula: ");
        int matricula =  leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o ano: ");
        int ano =  leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o curso: ");
        String curso =  leitor.nextLine();

        System.out.print("Digite a sigla do curso (ex: INF): ");
        String sigla =  leitor.nextLine();

        Curso c1 = new Curso(sigla, curso);
        a1.matricular(matricula, c1, ano);

        System.out.println(a1);

        System.out.println("Digite o curso alterado: ");
        String outro_curso =  leitor.nextLine();
        System.out.println("Digite a sigla do curso alterado: ");
        String outra_sigla =  leitor.nextLine();
        Curso novo_curso = new Curso(outra_sigla, outro_curso);
        a1.setCurso(novo_curso);

        System.out.println("Digite ano alterado: ");
        int outro_ano =  leitor.nextInt();
        leitor.nextLine();
        a1.setAno(outro_ano);

        System.out.println(a1);
    }
}

class Aluno2 {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    Aluno2(String nome) {
        this.nome = nome;
    }
    public void matricular (int matricula, Curso curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }
    public String toString() {
        return "Aluno : "+ nome + " - matricula : " + matricula + " - Curso : " + curso + " - " + ano;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}

class Curso {
    private String sigla;
    private String nome;

    Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {return sigla;}
    public String getNome() {return nome;}
    public void setSigla(String sigla) {this.sigla = sigla;}
    public void setNome(String nome) {this.nome = nome;}

    @Override
    public String toString() {
        return nome + " (" + sigla + ")";
    }
}