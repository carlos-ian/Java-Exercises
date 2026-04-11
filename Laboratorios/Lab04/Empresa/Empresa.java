package Laboratorios.Lab04.Empresa;

class Empresa {
    private String cnpj;
    private String razao;
    private Endereco endereco;

    Empresa(String cnpj, String razao, Endereco endereco) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return cnpj + ", " + razao + "\n" + endereco;
    }
}