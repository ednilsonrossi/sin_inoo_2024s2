import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Natan";
        int anoNascimento = 2001;
        int idade;

        System.out.println("Digite ano nascimento: ");
        anoNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite nome:");
        nome = scanner.nextLine();

        idade = 2024 - anoNascimento;
        System.out.println("Idade do " + nome + " é " + idade + " anos.");
        scanner.close();
    }

}
