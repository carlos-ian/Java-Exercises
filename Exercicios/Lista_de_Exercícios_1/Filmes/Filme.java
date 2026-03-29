package Lista_de_Exercícios_1.Filmes;

class Filme {
    static private int numero_filmes = 0;

    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autor;

    Filme(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        numero_filmes++;
    }

    public void setGenero(String genero) { this.genero = genero; }
    public void setAno(int ano) { this.ano = ano; }
    public void setAutor(String autor) { this.autor = autor; }
    public static int getNumero_filmes() { return numero_filmes; }

    @Override
    public String toString() {
        return "Filme " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Gênero: " + genero + "\n" +
                "Ano: " + ano + "\n" +
                "Autor: " + autor;
    }
}
