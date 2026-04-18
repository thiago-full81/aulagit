import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura (Ex.: 1,76): ");
        double h = scanner.nextDouble();

        double pesoIdeal = (72.7 * h) - 58;

        System.out.printf("Seu ppeso ideal para a altura de %.2fm é: %.3f Kg%n", h, pesoIdeal);

        scanner.close();
    }
}