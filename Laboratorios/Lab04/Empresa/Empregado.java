package Laboratorios.Lab04.Empresa;

class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;

    Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return nome + " (" + matricula + ")\n" + empresa + "\n";
    }
}
