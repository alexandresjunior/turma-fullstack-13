package exercicio07;

public class Modelo extends Item {

    private String marca;
    private Double motor;
    private Integer serie;

    public Modelo() {

    }

    public Modelo(Integer codigo, String nome, String descricao, String marca, Double motor, Integer serie) {
        super(codigo, nome, descricao);
        this.marca = marca;
        this.motor = motor;
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Modelo");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Marca: " + marca);
        System.out.println("Motor: " + motor);
        System.out.println("Serie: " + serie);
    }

}
