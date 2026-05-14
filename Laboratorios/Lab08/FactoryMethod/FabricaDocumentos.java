package Laboratorios.Lab08.FactoryMethod;

public class FabricaDocumentos extends Fabrica {
    @Override
    public Documento criarDocumento(String tipo, int numero, String remetente) {
        if (tipo.equalsIgnoreCase("CARTA")) {
            return new Carta(numero, remetente);
        } else if (tipo.equalsIgnoreCase("NOTIFICACAO")) {
            return new Notificacao(numero, remetente);
        } else if (tipo.equalsIgnoreCase("TELEGRAMA")) {
            return new Telegrama(numero, remetente);
        }
        throw new IllegalArgumentException("Tipo de documento desconhecido.");
    }
}