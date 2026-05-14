package Laboratorios.Lab08.Singleton;

public class Projeto {
    private String nomeProjeto;
    private double orcamento;
    private Empresa empresa; // Vínculo com a classe Empresa

    public Projeto(String nomeProjeto, double orcamento) {
        this.nomeProjeto = nomeProjeto;
        this.orcamento = orcamento;
        this.empresa = Empresa.getInstancia();
    }

    public void exibirDetalhes() {
        System.out.println("Projeto: " + nomeProjeto);
        System.out.println("Orçamento: R$ " + orcamento);
        System.out.println("Responsável: " + empresa.getNome());
        System.out.println("Endereço Corporativo: " + empresa.getEndereco());
        System.out.println("--------------------------------------");
    }
}
