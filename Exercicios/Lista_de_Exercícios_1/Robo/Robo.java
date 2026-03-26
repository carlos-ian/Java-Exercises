package Lista_de_Exercícios_1.Robo;

class Robo {
    private int id;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidade_po;
    private int limite_po;

    Robo(int id, int limite_po) {
        this.id = id;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.limite_po = limite_po;
        this.quantidade_po = 0;
    }

    public void ligar() {this.status = "ligado";}
    public void desligar() {this.status = "desligado";}

    public void andar(int x, int y) {
        if (this.status.equals("ligado")) {
            this.posicaoX = x;
            this.posicaoY = y;
            this.status = "andando";
            System.out.println("Robô " + id + " moveu-se para (" + posicaoX + ", " + posicaoY + ").");
        } else {
            System.out.println("O Robô aspirador está desligado. Ligue-o antes.");
        }
    }

    public void parar() {
        if (this.status.equals("ligado")) {
            this.status = "parado";
            System.out.println("Robô " + id + " está parado (" + posicaoX + ", " + posicaoY + ").");
        } else {
            System.out.println("O Robô aspirador está desligado. Ligue-o antes.");
        }
    }

    public void aspirar(int quantidade) {
        if (this.status.equals("ligado")) {
            this.quantidade_po += quantidade;
            System.out.println("aspirando...");

            if (this.quantidade_po > limite_po) {
                this.quantidade_po = limite_po;
                this.status = "desligado";
                System.out.println("Limite de pó atingido. Robô desligando automaticamente");
            }
        } else {
            System.out.println("O Robô aspirador está desligado. Ligue-o antes.");
        }
    }

    @Override
    public String toString() {
        return "------------------------------" +
                "\n[Robô #" + id + "]" +
                "\nStatus: " + status +
                "\nPosição: (" + posicaoX + ", " + posicaoY + ")" +
                "\nNível de Pó: " + quantidade_po + "/" + limite_po +
                "\n------------------------------";
    }
}
