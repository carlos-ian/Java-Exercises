package Lista_de_Exercícios_1.TVControle;

class Televisao {
    private int volume;
    private int canal;

    Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public int getVolume() { return volume;}
    public int getCanal() { return canal;}

    public void aumentarVolume(int aumentoVolume) {
        if (aumentoVolume + this.volume <= 100) {
            this.volume += aumentoVolume;
        } else {
            System.out.println("O limite de volume da televisão é 100");
        }
    }

    public void diminuirVolume(int diminuiVolume) {
        if (diminuiVolume + this.volume >= 0) {
            this.volume -= diminuiVolume;
        } else {
            System.out.println("O limite de volume da televisão é 100");
        }
    }

    public void setCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    @Override
    public String toString() {
        return "Canal Atual: " + this.canal +  "\nVolume Atual: " + this.volume;
    }
}