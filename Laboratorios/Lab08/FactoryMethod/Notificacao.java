package Laboratorios.Lab08.FactoryMethod;

public class Notificacao extends Documento {
    public Notificacao(int numero, String remetente) { super(numero, remetente); }

    @Override
    public void exibirInfo() {
        System.out.println("[NOTIFICAÇÃO] Nº: " + numero + " | Remetente: " + remetente);
    }
}
