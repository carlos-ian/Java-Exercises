package Lista_de_Exercícios_1.Moradores;

class Morador {
    private static int codigoSequencial = 0;

    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private int bloco;
    private int apartamento;
    private int codigoAcesso;

    Morador(String nome, String cpf, String celular, String dataNascimento, String sexo, int  bloco, int apartamento, int codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;

        codigoSequencial++;
    }

    public void mostrarMorador() {
        System.out.println("Morador: " + this.nome + " | CPF: " + this.cpf + " | Celular: " + this.celular);
        System.out.println("Data de Nascimento: " + this.dataNascimento + " | Sexo: " + this.sexo);
        System.out.println("Bloco: " + this.bloco + " | Apartamento: " + this.apartamento);
        System.out.println("Codigo de Acesso: " + this.codigoAcesso + "\n");
    }
}

