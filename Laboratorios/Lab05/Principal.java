package Laboratorios.Lab05;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta (0 para sair):"));
            if (numero == 0) break;

            String nome = JOptionPane.showInputDialog("Nome do Cliente:");
            String tel = JOptionPane.showInputDialog("Telefone do Cliente:");
            Cliente cliente = new Cliente(nome, tel);

            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo: 1-Corrente, 2-Salário, 3-Poupança"));

            Conta novaConta = null;
            if (tipo == 1) {
                novaConta = new ContaCorrente(numero, cliente);
            } else if (tipo == 2) {
                novaConta = new ContaSalario(numero, cliente);
            } else if (tipo == 3) {
                novaConta = new ContaPoupanca(numero, cliente);
            }

            if (novaConta != null) {
                contas.add(novaConta);
            }
        }

        String relatorio = "Contas Cadastradas:\n";
        for (Conta c : contas) {
            relatorio += c.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, relatorio);
    }
}
