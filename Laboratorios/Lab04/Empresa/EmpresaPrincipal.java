package Laboratorios.Lab04.Empresa;

public class EmpresaPrincipal {
    public static void main(String[] args) {
        Endereco endComercial = new Endereco("Av. das Nações", 500, "Distrito Industrial", "Bloco B", "Manaus", "AM");

        Empresa techCorp = new Empresa("12.345.678/0001-90", "Tech Solutions LTDA", endComercial);

        Empregado emp1 = new Empregado("João Pereira", 101, techCorp);
        Empregado emp2 = new Empregado("Carla Dias", 102, techCorp);

        System.out.println("--- DADOS DOS EMPREGADOS ---\n");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
