package Laboratorios.Lab04.Alunos;

class Departamento {
    private String nome;
    private String sigla;

    Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return nome + " (" + sigla + ") ";
    }
}
