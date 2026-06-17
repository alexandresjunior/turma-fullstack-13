package exercicio01;

public class AppTeste {

    public static void main(String[] args) {
        Transporte carro = new Transporte();

        carro.setId(1);
        carro.setAno(2024);
        carro.setModelo("Nissan Kicks");
        carro.setPotencia(150.0);
        carro.setCargaMaxima(2000.0);

        System.out.println("Consumo: " + carro.calcularConsumo());
    }
    
}
