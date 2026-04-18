import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = sc.nextLine();

        sc.close();

        System.out.printf("ola, %S!", nome);

    }
}
