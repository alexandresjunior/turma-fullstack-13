package exercicio07;

public class App {

    public static void main(String[] args) {
        Item i = new Item(1, "Roda Traseira", "Alguma descrição aqui.");

        i.exibirDetalhes();

        Modelo m = new Modelo(2, "Chassi", "null", "Nissan", 1.0, 3);

        m.exibirDetalhes();

        Carro c = new Carro(3, "Kicks", "null", "Nissan", 1.6, 2, "XYZ", null, null, null, null);
    
        c.exibirDetalhes();
    }
    
}
