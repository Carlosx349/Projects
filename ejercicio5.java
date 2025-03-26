public class ejercicio5 {

    public static int mSenh(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        return mSenh(n - 2) + mSenh(n - 3);
    }

    public static void main(String[] args) {
        int n = 10; // Ejemplo de uso
        System.out.println("El término " + n + "-ésimo de la serie de Padovan es: " + mSenh(n));
    }
}
