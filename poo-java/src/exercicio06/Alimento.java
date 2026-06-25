package exercicio06;

public class Alimento extends ItemDeLoja {

    private int selo;

    public Alimento() {

    }

    public Alimento(int codigo, String nome, String descricao, double valor, int selo) {
        super(codigo, nome, descricao, valor);
        this.selo = selo;
    }

    public int getSelo() {
        return selo;
    }

    public void setSelo(int selo) {
        this.selo = selo;
    }

    @Override
    public int getIdentificador() {
        return selo;
    }

}
