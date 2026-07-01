package exercicio08;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nome;
    private List<Selecao> selecoes;
    private Integer rodada;

    public Grupo(String nome, Integer rodada) {
        this.nome = nome;
        this.selecoes = new ArrayList<>();
        this.rodada = rodada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Selecao> getSelecoes() {
        return selecoes;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public void adicionarSelecao(Selecao selecao) {
        if (selecoes.size() < 4) {
            selecoes.add(selecao);
        } else {
            System.out.println("Um grupo só pode ter apenas 4 seleções.");
        }
    }

}
