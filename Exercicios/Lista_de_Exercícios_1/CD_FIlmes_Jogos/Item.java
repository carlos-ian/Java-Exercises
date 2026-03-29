package Lista_de_Exercícios_1.CD_FIlmes_Jogos;

class Item {
    protected String titulo;
    protected int ano;
    protected int duracao;
    protected String comentarios;

    Item(String titulo, int ano, int duracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {return titulo;}
    public int getAno() {return ano;}
    public int getDuracao() {return duracao;}
    public String getComentarios() {return comentarios;}

    public void mostrarDados() {
        System.out.println("Título: " + titulo + " | Ano: " + ano +
                " | Duração: " + duracao + " min | Comentário: " + comentarios);
    }
}