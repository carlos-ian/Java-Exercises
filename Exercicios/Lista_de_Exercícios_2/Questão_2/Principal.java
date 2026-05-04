package Lista_de_Exercícios_2.Questão_2;

public class Principal {
    public static void main(String[] args) {
        LojaFisica matriz = new LojaFisica(1, "11.111.111/0001-01", "Supermercado Central LTDA", "Av. Principal, 100", "Carlos Magno");
        LojaFisica filial1 = new LojaFisica(2, "11.111.111/0002-02", "Supermercado Central - Filial Sul", "Rua das Flores, 50", "Ana Paula");
        LojaFisica filial2 = new LojaFisica(3, "11.111.111/0003-03", "Supermercado Central - Filial Norte", "Rodovia Norte, KM 10", "Ricardo Silva");

        System.out.println("ESTADO INICIAL DAS LOJAS:");
        matriz.mostrarLojaCompleta();
        filial1.mostrarLojaCompleta();
        filial2.mostrarLojaCompleta();

        System.out.println("\nMOVIMENTAÇÃO DO DIA:");
        matriz.registra_abertura_dia();
        matriz.registra_abertura_dia();
        filial1.registra_abertura_dia();
        filial2.registra_fechamento_dia();

        System.out.println("\nESTADO APÓS MOVIMENTAÇÃO:");
        matriz.mostrarLojaCompleta();
        filial1.mostrarLojaCompleta();
        filial2.mostrarLojaCompleta();
    }
}