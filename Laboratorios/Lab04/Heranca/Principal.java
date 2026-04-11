package Laboratorios.Lab04.Heranca;

import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList <ProgramaTV> programas = new ArrayList <ProgramaTV>();

        ProgramaTV p = new ProgramaTV("O outro lado do paraíso","Novela");
        p.diretor = new Pessoa("Diretor 1", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Orgulho e Paixão","Novela");
        p.diretor = new Pessoa("Diretor 2", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Marley e eu","Filme");
        p.diretor = new Pessoa("Diretor 3", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Show Ivete Sangalo","Show");
        p.diretor = new Pessoa("Diretor 4", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
        programas.add(p);

        p = new Serie("Game of thrones","Show", 8, 50);
        p.diretor = new Pessoa("Diretor 5", "Estadunidense");
        p.setArtistas(new Pessoa("Artista 8", "Estadunidense"));
        p.setArtistas(new Pessoa("Artista 9", "Estadunidense"));
        programas.add(p);

        p = new Serie("Shameless","Show", 9, 70);
        p.diretor = new Pessoa("Diretor 6", "Estadunidense");
        p.setArtistas(new Pessoa("Artista 9", "Estadunidense"));
        p.setArtistas(new Pessoa("Artista 10", "Estadunidense"));
        programas.add(p);

        for (int i=0;i<programas.size();i++) {
            System.out.println(programas.get(i) + "\n");
        }
    }
}
