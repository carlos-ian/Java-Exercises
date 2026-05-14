package Laboratorios.Lab08.FactoryMethod;

public abstract class Fabrica {
    public abstract Documento criarDocumento(String tipo, int numero, String remetente);
}
