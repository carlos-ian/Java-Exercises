package Lista_de_Exercícios_1.CD_FIlmes_Jogos;

class CD extends Item {
    private String artista;
    private int faixas;

    CD(String titulo, int ano, int duracao, String comentarios, String artista, int faixas) {
        super(titulo, ano, duracao, comentarios);
        this.artista = artista;
        this.faixas = faixas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Artista: " + artista + "| Faixas: " + faixas);
    }
}

