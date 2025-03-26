import java.util.Scanner;

public class PadovanSeries {
    public static int padovan(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        return padovan(n - 2) + padovan(n - 3);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            
            System.out.println("El término " + num + " de la serie de Padovan es: " + padovan(num));
        }
    }
}
