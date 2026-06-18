package exercicio04;

import java.time.LocalDate;

public class Dependente {

    private Integer sequencial;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private Integer sexo;
    private Boolean participaPlano;
    private Funcionario funcionario;

    public Dependente() {

    }

    public Dependente(Integer sequencial, String nomeCompleto, LocalDate dataNascimento, Integer sexo,
            Boolean participaPlano, Funcionario funcionario) {
        this.sequencial = sequencial;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.participaPlano = participaPlano;
        this.funcionario = funcionario;
    }

    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Boolean getParticipaPlano() {
        return participaPlano;
    }

    public void setParticipaPlano(Boolean participaPlano) {
        this.participaPlano = participaPlano;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
