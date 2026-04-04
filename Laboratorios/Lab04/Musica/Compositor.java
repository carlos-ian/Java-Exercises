package Laboratorios.Lab04.Musica;

class Compositor {
    private String nome;
    private String nacionalidade;

    Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "Nome: " + nome + " (" + nacionalidade + ") ";
    }
}
