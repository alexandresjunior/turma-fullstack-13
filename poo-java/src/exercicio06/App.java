package exercicio06;

public class App {

    public static void main(String[] args) {
        ItemDeLoja i = new ItemDeLoja(1, "Escova de Dente", "null", 12.99);

        System.out.println("Identificador do item: " + i.getIdentificador());   // codigo = 1
        
        Alimento a = new Alimento(2, "Maçã", "null", 4.99, 23);
        
        System.out.println("Identificador do alimento: " + a.getIdentificador());   // selo = 23

        Ferramenta f = new Ferramenta(3, "Chave de fenda", "null", 34.99, 
                                    "ESCRITÓRIO", 175);     

        System.out.println("Identificador da ferramenta: " + f.getIdentificador());     // serial = 175
    }
    
}
