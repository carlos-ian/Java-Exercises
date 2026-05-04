package Lista_de_Exercícios_2.Questão_1;

public class Horistas extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    Horistas(String nome, String sobrenome, int horasTrabalhadas, double valorHora) {
        super(nome, sobrenome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularGanhos() {
        return horasTrabalhadas * valorHora;
    }

    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public double getValorHora() { return valorHora; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas;}
    public void setValorHora(double valorHora) { this.valorHora = valorHora;}
}
