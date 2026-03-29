package Lista_de_Exercícios_1.CD_FIlmes_Jogos;

class Jogo extends Item {
    private int jogadores;
    private String plataforma;

    Jogo(String titulo, int ano, int duracao, String comentarios, int jogadores, String plataforma) {
        super(titulo, ano, duracao, comentarios);
        this.jogadores = jogadores;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {return plataforma;}

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Jogadores: " + jogadores);
    }
}