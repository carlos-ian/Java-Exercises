package Laboratorios.Lab08.FactoryMethod;

public class CadastroDocumentos {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaDocumentos();

        Documento doc1 = fabrica.criarDocumento("CARTA", 101, "João Silva");
        Documento doc2 = fabrica.criarDocumento("NOTIFICACAO", 202, "Prefeitura Municipal");
        Documento doc3 = fabrica.criarDocumento("TELEGRAMA", 303, "Empresa XPTO");

        doc1.exibirInfo();
        doc2.exibirInfo();
        doc3.exibirInfo();
    }
}
