import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double volumeTotal = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o volume do dia %d: ", i);
            double volume = sc.nextDouble();

            volumeTotal += volume;
        }

        sc.close();

        System.out.println("Volume total: " + volumeTotal);
    }
    
}
