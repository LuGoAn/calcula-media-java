import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    
        System.out.print("Digite a 1a nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a 2a nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a 3a nota: ");
        double nota3 = scanner.nextDouble();

        
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("-----------------------------------------");
        System.out.printf("Media final: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Situacao: APROVADO! Parabens!");
        } else if (media >= 5.0) {
            System.out.println("Situacao: RECUPERACAO. Estude um pouco mais!");
        } else {
            System.out.println("Situacao: REPROVADO. Nao desista, continue tentando!");
        }
        System.out.println("=========================================");

        scanner.close();
    }
}
