import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero possitivo:");
        int numero = sc.nextInt();

        sc.close();

        if (numero < 0) {
            System.out.println("numero invalido");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }

}
