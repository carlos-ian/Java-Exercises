package Lista_de_Exercícios_2.Questão_2;

public class LojaFisica extends Loja {
    private String endereco;
    private String gerente;

    public LojaFisica(int identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
        super(identificador, cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public void mostrarLojaCompleta() {
        System.out.println("--- DADOS DA LOJA ---");
        System.out.println("ID: " + getIdentificador());
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Endereço: " + endereco);
        System.out.println("Gerente: " + gerente);
        System.out.println("Status: " + (isAberta() ? "ABERTA" : "FECHADA"));
        System.out.println("---------------------");
    }
}
