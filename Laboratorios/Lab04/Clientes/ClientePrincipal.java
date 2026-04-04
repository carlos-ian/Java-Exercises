package Laboratorios.Lab04.Clientes;

public class ClientePrincipal {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Av. Paulista", 1000, "Bela Vista", "Apto 42", "São Paulo", "SP");

        Cliente cliente1 = new Cliente("Mariana Oliveira", "123.456.789-00", end1);

        Cliente cliente2 = new Cliente(
                "Carlos Alberto",
                "987.654.321-11",
                new Endereco("Rua das Flores", 55, "Centro", "Casa", "Curitiba", "PR")
        );

        System.out.println("--- RELATÓRIO DE CLIENTES ---\n");
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
