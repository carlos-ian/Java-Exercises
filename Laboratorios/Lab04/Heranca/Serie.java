package Laboratorios.Lab04.Heranca;

class Serie extends ProgramaTV{
    int temporadas;
    int episodios;

    Serie(String nome, String categoria, int temporadas, int episodios) {
        super(nome, categoria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return super.toString() + "Temporadas: " +  temporadas + ", Episodios: " + episodios;
    }
}
