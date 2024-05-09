import java.util.Locale;
import java.util.Scanner;

public class ScannerDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Digitea sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura " + altura + "cm ");

        scanner.close();
    }
}
