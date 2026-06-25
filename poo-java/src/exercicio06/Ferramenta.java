package exercicio06;

public class Ferramenta extends ItemDeLoja {

    private String categoria;
    private int serial;

    public Ferramenta() {

    }

    public Ferramenta(int codigo, String nome, String descricao, double valor, String categoria, int serial) {
        super(codigo, nome, descricao, valor);
        this.categoria = categoria;
        this.serial = serial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public int getIdentificador() {
        return serial;
    }

}
