package Laboratorios.Lab04.Musica;

class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    Musica(String nome, int ano, String tipo, Compositor compositor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return "Música: " + nome +
                "\nAno: " + ano +
                "\nEstilo: " + tipo +
                "\n" + compositor.toString() +
                "\n---------------------------";
    }
}
