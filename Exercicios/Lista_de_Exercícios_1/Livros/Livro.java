package Lista_de_Exercícios_1.Livros;

class Livro {
    private static int numeroLivros = 0;

    private String titulo;
    private int codigo;
    private Pessoa autor;
    private String editora;
    private int edicao;
    private int ano;
    private String local;
    private String genero;

    private static String[] generosExistentes = new String[5];
    private static int[] contagemPorGenero = new int[5];
    private static int qtdGenerosRegistrados = 0;

    Livro(String titulo, int codigo, Pessoa autor, String editora, int edicao, int ano, String local, String genero) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.local = local;
        this.genero = genero;

        numeroLivros++;
        contabilizarGenero(genero);
    }

    private void contabilizarGenero(String genero) {
        for (int i = 0; i < qtdGenerosRegistrados; i++) {
            if (generosExistentes[i].equalsIgnoreCase(genero)) {
                contagemPorGenero[i]++;
                return;
            }
        }
        if (qtdGenerosRegistrados < 5) {
            generosExistentes[qtdGenerosRegistrados] = genero;
            contagemPorGenero[qtdGenerosRegistrados] = 1;
            qtdGenerosRegistrados++;
        }
    }

    public static void imprimirGeneros() {
        for (int i = 0; i < qtdGenerosRegistrados; i++) {
            System.out.println(generosExistentes[i] + ": " + contagemPorGenero[i]);
        }
    }

    public String getTitulo() {return this.titulo;}
    public int gerCodigo() {return this.codigo;}
    public Pessoa getAutor() {return this.autor;}
    public String getEditora() {return this.editora;}
    public int getEdicao() {return this.edicao;}
    public int getAno() {return this.ano;}
    public String getLocal() {return this.local;}
    public String getGenero() {return this.genero;}

    public void setTirulo(String titulo) {this.titulo = titulo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setAutor(Pessoa autor) {this.autor = autor;}
    public void setEditora(String editora) {this.editora = editora;}
    public void setEdicao(int edicao) {this.edicao = edicao;}
    public void setAno(int ano) {this.ano = ano;}
    public void setLocal(String local) {this.local = local;}
    public void setGenero(String genero) {this.genero = genero;}

    public static int getNumeroLivros() {return numeroLivros;}

    public String mostrarLivro() {
        return "Código: " + this.codigo + "\n" +
                "Título: " + this.titulo + "\n" +
                "Gênero: " + this.genero + "\n" +
                "Referência: " + autor.mostrarNome() + " " + this.titulo + ". " + this.edicao + ". " + this.local + ": " + this.editora + ", " + this.ano + "\n";
    }
}

