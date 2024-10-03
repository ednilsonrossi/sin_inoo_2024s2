import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        Scanner tufy = new Scanner(System.in);
        String nome = "Natan";
        int anoNascimento = 2001;
        int idade;

        System.out.println("Digite ano nascimento: ");
        anoNascimento = tufy.nextInt();
        tufy.nextLine();

        System.out.println("Digite nome:");
        nome = tufy.nextLine();

        idade = 2024 - anoNascimento;
        System.out.println("Idade do " + nome + " é " + idade + " anos.");
        tufy.close();
    }

}
