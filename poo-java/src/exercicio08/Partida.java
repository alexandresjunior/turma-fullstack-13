package exercicio08;

public class Partida implements Classificacao {

    private Integer fase;
    private Integer rodada;
    private Selecao time1;
    private Selecao time2;

    public Partida(Integer fase, Integer rodada, Selecao time1, Selecao time2) {
        this.fase = fase;
        this.rodada = rodada;
        this.time1 = time1;
        this.time2 = time2;
    }

    public Integer getFase() {
        return fase;
    }

    public void setFase(Integer fase) {
        this.fase = fase;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public Selecao getTime1() {
        return time1;
    }

    public void setTime1(Selecao time1) {
        this.time1 = time1;
    }

    public Selecao getTime2() {
        return time2;
    }

    public void setTime2(Selecao time2) {
        this.time2 = time2;
    }

    public Selecao verificaFavoritismo() {
        if (time1.getPontos() > time2.getPontos()) {
            return time1;
        } else {
            return time2;
        }
    }

    public void jorgarPartida(int golsTime1, int golsTime2) {
        if (golsTime1 > golsTime2) {
            time1.ganharPartida();
            time2.perderPartida();
        } else if (golsTime2 > golsTime1) {
            time1.perderPartida();
            time2.ganharPartida();
        } else {
            time1.empatarPartida();
            time2.empatarPartida();
        }

        time1.atualizaGols(golsTime1, golsTime2);
        time2.atualizaGols(golsTime2, golsTime1);
    }

    @Override
    public void atualizaStatus(Grupo grupo) {
        grupo.setRodada(rodada++);
    }

    @Override
    public void classificaSelecao() {
        if (time1.getPontos() > time2.getPontos()) {
            System.out.println("Seleção " + time1.getNome() + " classicada!");
        } else {
            System.out.println("Seleção " + time2.getNome() + " classicada!");
        }
    }

    @Override
    public void mostrarTabela(Grupo grupo, Integer fase) {
        System.out.println("Grupo: " + grupo.getNome() + " | Fase: " + fase);

        for (Selecao selecao : grupo.getSelecoes()) {
            System.out.println(selecao.getNome() + " | Pontos: " + selecao.getPontos());
        }
    }

}
