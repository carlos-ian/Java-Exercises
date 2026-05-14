package Laboratorios.Lab08.Singleton;

public class Principal {
    public static void main(String[] args) {
        Empresa ebm = Empresa.getInstancia();

        System.out.println(ebm);

        Projeto p1 = new Projeto("Residencial Metropolitan", 5000000.00);
        Projeto p2 = new Projeto("Comercial T-55 Business", 3200000.00);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}
