package Lista_de_Exercícios_1.Horario;

class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    Horario(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    private boolean validarHora(int hora) {
        return hora >= 0 && hora <= 23;
    }

    private boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto <= 59;
    }

    private boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo <= 59;
    }

    public void setHora(int hora) {
        if (validarHora(hora)) {
            this.hora = hora;
        } else {
            System.out.println("Hora invalida!");
        }
    }

    public void setMinuto(int minuto) {
        if (validarMinuto(minuto)) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto invalida!");
        }
    }

    public void setSegundo(int segundo) {
        if (validarSegundo(segundo)) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo invalida!");
        }
    }

    public void setHorario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {return hora;}
    public int getMinuto() {return minuto;}
    public int getSegundo() {return segundo;}
    public String getHorario() {return hora + ":" + minuto + ":" + segundo; }

    public static int horarioDiferenca(Horario h1, Horario h2) {
        int totalMinutos1 = h1.getMinuto() + (h1.getHora() * 60);
        int totalMinutos2 = h2.getMinuto() + (h2.getHora() * 60);
        int diferenca = totalMinutos1 - totalMinutos2;
        return Math.abs(diferenca);
    }
}
