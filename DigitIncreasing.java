import java.util.Scanner;

public class DigitIncreasing {
    public static int isDigitIncreasing(int num) {
        
        for (int n = 1; n <= 9; n++) {
            int sum = 0;
            int term = 0;
            
            
            while (sum < num) {
                term = term * 10 + n; 
                sum += term;
                
                if (sum == num) {
                    return 1; 
                }
            }
        }
        return 0; 
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            
            if (isDigitIncreasing(num) == 1) {
                System.out.println(num + " es un número digit-increasing.");
            } else {
                System.out.println(num + " no es un número digit-increasing.");
            }
        }
    }
}