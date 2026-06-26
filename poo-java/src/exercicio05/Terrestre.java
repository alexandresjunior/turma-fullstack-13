package exercicio05;

public class Terrestre extends MeioDeTransporte {

    private int qtdeRodas;
    private double potencia;

    public Terrestre() {

    }

    public Terrestre(int id, short ano, String modelo, double cargaMaxima, int qtdeRodas, double potencia) {
        super(id, ano, modelo, cargaMaxima);
        this.qtdeRodas = qtdeRodas;
        this.potencia = potencia;
    }

    public int getQtdeRodas() {
        return qtdeRodas;
    }

    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double consumo() {
        return potencia * getCargaMaxima() * 100;
    }

}
