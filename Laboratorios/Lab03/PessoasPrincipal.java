package Laboratorios.Lab03;

public class People {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana Silva", 28, "Feminino", "(11) 98888-7777");
        Pessoa p2 = new Pessoa("Bruno Costa", 34, "Masculino", "(21) 97777-6666");
        Pessoa p3 = new Pessoa("Carla Dias", 22, "Feminino", "(31) 96666-5555");

        System.out.println(p1.retornarDados());
        System.out.println(p2.retornarDados());
        System.out.println(p3.retornarDados());
    }
}

class Pessoa {
    public String nome;
    public int idade;
    public String sexo;
    public String telefone;

    Pessoa(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String retornarDados() {
        return this.nome + " de " + this.idade + " anos do sexo " + this.sexo + " cujo telefone é " + this.telefone;
    }
}