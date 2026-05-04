package Laboratorios.Lab05;

public class ContaSalario extends ContaCorrente {
    public ContaSalario(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - (valor + 0.01);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + (valor - 0.01);
    }
}
