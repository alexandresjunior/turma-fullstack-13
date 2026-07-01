package exercicio08;

public class CopaDoMundo {

    public static void main(String[] args) {
        Grupo grupoC = new Grupo("Grupo C", 1);

        Selecao brasil = new Selecao("Brasil", grupoC, true);
        Selecao marrocos = new Selecao("Marrocos", grupoC, false);
        Selecao escocia = new Selecao("Escócia", grupoC, false);
        Selecao haiti = new Selecao("Haiti", grupoC, false);

        grupoC.adicionarSelecao(brasil);
        grupoC.adicionarSelecao(marrocos);
        grupoC.adicionarSelecao(escocia);
        grupoC.adicionarSelecao(haiti);

        Partida partida1 = new Partida(1, 1, brasil, marrocos);

        partida1.jorgarPartida(1, 1);

        Partida partida2 = new Partida(1, 2, brasil, haiti);

        partida2.jorgarPartida(3, 0);

        Partida partida3 = new Partida(1, 3, brasil, escocia);

        partida3.jorgarPartida(3, 0);

        partida3.mostrarTabela(grupoC, 1);
    }
    
}
