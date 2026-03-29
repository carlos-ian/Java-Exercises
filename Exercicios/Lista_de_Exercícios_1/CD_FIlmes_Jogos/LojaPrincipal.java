package Lista_de_Exercícios_1.CD_FIlmes_Jogos;

public class LojaPrincipal {
    public static void main(String[] args) {
        Item[] inventario = new Item[30];

        for (int i = 0; i < 10; i++) {
            inventario[i] = new Filme("Filme " + (i+1), 2020 + i, 120, "Bom", "Diretor " + i);
        }

        for (int i = 10; i < 20; i++) {
            inventario[i] = new CD("Álbum " + (i-9), 2010 + i, 45, "Legal", "Artista X", 12);
        }

        for (int i = 20; i < 30; i++) {
            inventario[i] = new Jogo("Game " + (i-19), 2022, 60, "Épico", 1, "PC/PS5");
        }

        System.out.println("--- Items no Inventário ---");
        for (Item item : inventario) {
            if (item != null) {
                item.mostrarDados();

                if (item instanceof Jogo) {
                    Jogo jogoRef = (Jogo) item;
                    System.out.println("   [PLATAFORMA EXCLUSIVA]: " + jogoRef.getPlataforma());
                }
                System.out.println("----------------------------------");
            }
        }
    }
}