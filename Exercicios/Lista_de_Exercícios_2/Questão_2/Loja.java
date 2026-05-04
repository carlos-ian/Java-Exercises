package Lista_de_Exercícios_2.Questão_2;

public abstract class Loja implements Registro {
    protected int id;
    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    Loja(int id, String cnpj, String razaoSocial) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    @Override
    public String toString() {
        String status = aberta ? "Aberta" : "Fechada";
        return "Razão Social: " + razaoSocial + " | CNPJ: " + cnpj + " | Status: " + status;
    }

    @Override
    public void registra_abertura_dia() {
        if (!aberta) {
            this.aberta = true;
            System.out.println("A loja " + razaoSocial + " foi aberta agora.");
        } else {
            System.out.println("Aviso: A loja " + razaoSocial + " já está aberta!");
        }
    }

    @Override
    public void registra_fechamento_dia() {
        if (aberta) {
            this.aberta = false;
            System.out.println("A loja " + razaoSocial + " foi fechada agora.");
        } else {
            System.out.println("Aviso: Não é possível fechar uma loja que já está fechada!");
        }
    }

    public int getIdentificador() { return id; }
    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
    public boolean isAberta() { return aberta; }
}
