package exercicio02;

import java.time.LocalDate;

public class AppTeste {
    
    public static void main(String[] args) {
        Produto produto = new Produto(7, 
                                "Iogurte Zero", 
                                "Triplo Zero", 
                                LocalDate.of(2026, 6, 20));

        System.out.println("Dias restantes: " + produto.calcularDiasRestantes());
    }

}
