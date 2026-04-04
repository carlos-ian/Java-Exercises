package Laboratorios.Lab04.Alunos;

class Aluno {
    private String nome;
    private int ano;
    private int matricula;
    private Curso curso;

    Aluno(String nome, int ano, int matricula, Curso curso) {
        this.nome = nome;
        this.ano = ano;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " (" + matricula + ")" + " / " + ano + "\n" +
                curso.toString() + "\n";
    }
}
