package Lista_de_Exercícios_2.Questão_1;

public abstract class Funcionario {
    protected String nome;
    protected String sobrenome;

    Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public abstract double calcularGanhos();

    public void mostrarDados() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.printf("Ganhos Mensais: R$ %.2f%n", calcularGanhos());
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
}
