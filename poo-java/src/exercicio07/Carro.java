package exercicio07;

import java.time.LocalDate;

public class Carro extends Modelo {

    private String chassi;
    private String cor;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private LocalDate dataEntrada;

    public Carro() {

    }

    public Carro(Integer codigo, String nome, String descricao, String marca, Double motor, Integer serie,
            String chassi, String cor, Integer anoFabricacao, Integer anoModelo, LocalDate dataEntrada) {
        super(codigo, nome, descricao, marca, motor, serie);
        this.chassi = chassi;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.dataEntrada = dataEntrada;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Carro");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Marca: " + getMarca());
        System.out.println("Motor: " + getMotor());
        System.out.println("Serie: " + getSerie());
        System.out.println("Chassi: " + chassi);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricacao: " + anoFabricacao);
        System.out.println("Ano do Modelo: " + anoModelo);
        System.out.println("Data de Entrada: " + dataEntrada);
    }

}
