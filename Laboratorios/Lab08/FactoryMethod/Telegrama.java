package Laboratorios.Lab08.FactoryMethod;

public class Telegrama extends Documento {
    public Telegrama(int numero, String remetente) { super(numero, remetente); }

    @Override
    public void exibirInfo() {
        System.out.println("[TELEGRAMA] Nº: " + numero + " | Remetente: " + remetente);
    }
}
