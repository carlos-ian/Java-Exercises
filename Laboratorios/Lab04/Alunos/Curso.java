package Laboratorios.Lab04.Alunos;

class Curso {
    private String nome;
    private String sigla;
    private Departamento departamento;

    Curso(String nome, String sigla,  Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return nome + " (" + sigla + ")" + " / " + departamento.toString();
    }
}
