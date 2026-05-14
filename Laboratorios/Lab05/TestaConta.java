package Laboratorios.Lab05;

public class TestaConta {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", "1111-1111");
        Cliente c2 = new Cliente("Maria", "2222-2222");

        Conta cc = new ContaCorrente(101, c1);
        Conta cp = new ContaPoupanca(202, c2);

        cc.depositar(100.00);
        cc.sacar(20.00);

        cp.depositar(100.00);
        cp.sacar(20.00);

        System.out.println(cc);
        System.out.println(cp);

        ((ContaPoupanca) cp).atualizaSaldo(10);
        System.out.println("Saldo Poupanca após 10%: " + cp.getSaldo());

        // --- Tipos próprios e Transferência ---
        ContaCorrente contaC = new ContaCorrente(102, c1);
        ContaPoupanca contaP = new ContaPoupanca(203, c2);

        contaC.depositar(200.05);
        contaC.transferir(100.00, contaP);

        System.out.println("\n--- (Transferência) ---");
        System.out.println("CC após transferir 100: " + contaC.getSaldo());
        System.out.println("CP após receber 100: " + contaP.getSaldo());

        ContaSalario cs = new ContaSalario(301, c1);
        cs.depositar(100.01);
        cs.sacar(10.00);
        System.out.println(cs);

        cs.transferir(50.00, contaP);
        System.out.println(cs);
        System.out.println(contaP);
    }
}