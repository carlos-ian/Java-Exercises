package Laboratorios.Lab05;

public class ContaPoupanca extends Conta {
    ContaPoupanca(int numero, Cliente dono) {
        super(numero, dono);
    }

    public void atualizaSaldo(double percentual) {
        this.saldo = this.saldo + (this.saldo * (percentual / 100));
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}