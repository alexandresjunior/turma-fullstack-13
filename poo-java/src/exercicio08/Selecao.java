package exercicio08;

public class Selecao {
    
    private String nome;
    private Grupo grupo;
    private Boolean favorita;
    private Integer pontos = 0;
    private Integer jogos = 0;
    private Integer vitorias = 0;
    private Integer empates = 0;
    private Integer derrotas = 0;
    private Integer golsPro = 0;
    private Integer golsContra = 0;
    private Integer saldoGols = 0;
    
    public Selecao(String nome, Grupo grupo, Boolean favorita) {
        this.nome = nome;
        this.grupo = grupo;
        this.favorita = favorita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Boolean getFavorita() {
        return favorita;
    }

    public void setFavorita(Boolean favorita) {
        this.favorita = favorita;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Integer getJogos() {
        return jogos;
    }

    public void setJogos(Integer jogos) {
        this.jogos = jogos;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(Integer golsPro) {
        this.golsPro = golsPro;
    }

    public Integer getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(Integer golsContra) {
        this.golsContra = golsContra;
    }

    public Integer getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(Integer saldoGols) {
        this.saldoGols = saldoGols;
    }

    public void ganharPartida() {
        this.jogos++;
        this.vitorias++;
        this.pontos += 3;
    }

    public void empatarPartida() {
        this.jogos++;
        this.empates++;
        this.pontos += 1;
    }

    public void perderPartida() {
        this.jogos++;
        this.derrotas++;
    }

    public void atualizaGols(int golsFeitos, int golsAdversario) {
        this.golsPro += golsFeitos;
        this.golsContra += golsAdversario;
        this.saldoGols = this.golsPro - this.golsContra;
    }

}
