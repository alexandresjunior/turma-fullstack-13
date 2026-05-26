import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço da fatia do bolo:");
        double preco = sc.nextDouble();

        System.out.println("Digite o valor em dinheiro disponível:");
        double valorDisponivel = sc.nextDouble();

        sc.close();

        if (valorDisponivel >= preco) {
            System.out.println("Compra aprovada! Bom apetite.");
        } else {
            double falta = preco - valorDisponivel;
            System.out.printf("Saldo insuficiente. Faltam R$ %.2f", falta);
        }
    }

}
