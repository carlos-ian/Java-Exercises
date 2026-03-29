package Lista_de_Exercícios_1.CD_FIlmes_Jogos;

class Filme extends Item {
    private String diretor;

    Filme(String titulo, int ano, int duracao, String comentarios, String diretor) {
        super(titulo, ano, duracao, comentarios);
        this.diretor = diretor;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Diretor:" + diretor);
    }
}
