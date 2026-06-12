import java.util.Scanner;

public class AppProcedural {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        System.out.println("Digite o e-mail:");
        String email = sc.nextLine();

        System.out.println("Digite a senha:");
        String senha = sc.nextLine();

        System.out.println("=== DETALHES DO USUÁRIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Senha: ******");

        System.out.println("Digite o nome do usuário #2:");
        String nome2 = sc.nextLine();

        System.out.println("Digite o CPF:");
        String cpf2 = sc.nextLine();

        System.out.println("Digite o e-mail:");
        String email2 = sc.nextLine();

        System.out.println("Digite a senha:");
        String senha2 = sc.nextLine();

        System.out.println("=== DETALHES DO USUÁRIO #2 ===");
        System.out.println("Nome: " + nome2);
        System.out.println("CPF: " + cpf2);
        System.out.println("E-mail: " + email2);
        System.out.println("Senha: ******");

        sc.close();
    }
}
