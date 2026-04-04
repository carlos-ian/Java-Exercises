package Laboratorios.Lab04.Musica;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Compositor comp1 = new Compositor("Lana Del Rey", "Estadunidense");
        Compositor comp2 = new Compositor("Marina Sena", "Brasileiro");

        Musica musica1 = new Musica("Born to Die", 2012, "Eletrônica", comp1);
        Musica musica2 = new Musica("Lua Cheia", 2025, "Pop", comp2);
        Musica musica3 = new Musica("Numa Ilha", 2025, "Pop", comp2);

        System.out.println("--- LISTA DE MÚSICAS ---\n");
        System.out.println(musica1);
        System.out.println(musica2);
        System.out.println(musica3);
    }
}
