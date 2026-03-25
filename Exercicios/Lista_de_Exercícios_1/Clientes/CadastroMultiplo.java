package Lista_de_Exercícios_1.Clientes;

public class CadastroMultiplo {
    public static void main(String[] args) {
        Cliente[] listaClientes = new Cliente[5];

        listaClientes[0] = new Cliente("Maria");
        listaClientes[0].setTelefone("9823-2323");
        listaClientes[0].setIdade(20);

        listaClientes[1] = new Cliente("Davi");
        listaClientes[1].setTelefone("1111-1111");
        listaClientes[1].setIdade(30);

        listaClientes[2] = new Cliente("Brenno");
        listaClientes[2].setTelefone("2222-2222");
        listaClientes[2].setIdade(25);

        listaClientes[3] = new Cliente("Joel");
        listaClientes[3].setTelefone("3333-3333");
        listaClientes[3].setIdade(20);

        listaClientes[4] = new Cliente("Heitor");
        listaClientes[4].setTelefone("4444-4444");
        listaClientes[4].setIdade(28);

        for (int i = 0; i < listaClientes.length; i++) {
            System.out.println(listaClientes[i].toString());
        }
    }
}
