package Lista_de_Exercícios_1.Livros;

class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeIntermediario;

    Pessoa(String nome, String sobrenome, String nomeIntermediario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeIntermediario = nomeIntermediario;
    }

    public String mostrarNome() {
        return this.sobrenome.toUpperCase() + ", " + this.nome.toUpperCase().charAt(0) + ". " + this.nomeIntermediario.toUpperCase().charAt(0) + ".";
    }
}
