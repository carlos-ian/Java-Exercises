package Laboratorios.Lab08.FactoryMethod;

public class Carta extends Documento {
    public Carta(int numero, String remetente) { super(numero, remetente); }

    @Override
    public void exibirInfo() {
        System.out.println("[CARTA] Nº: " + numero + " | Remetente: " + remetente);
    }
}
