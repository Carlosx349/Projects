import java.util.Scanner;

public class ejercicio3palindromo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.println("Ingrese un número para verificar si es un palíndromo:");
            int numero = scanner.nextInt(); 
            
            if (esPalindromo(numero)) { 
                System.out.println("El número " + numero + " es un palíndromo.");
            } else {
                System.out.println("El número " + numero + " no es un palíndromo.");
            }
        } 
    }

    
    public static boolean esPalindromo(int numero) {
        int original = numero; 
        int invertido = 0; 
        
        // Invertir el número
        while (numero != 0) {
            int digito = numero % 10; 
            invertido = invertido * 10 + digito; 
            numero /= 10; 
        }
        
        
        return original == invertido;
    }
}