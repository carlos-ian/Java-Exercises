package Laboratorios.Lab04.Clientes;

class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")\n" + endereco + "\n";
    }
}
