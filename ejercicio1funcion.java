public class ejercicio1funcion {
    static int totalCabezas = 35;
    static int totalPatas = 94;

    public static void main(String[] args) throws Exception {
        for (int patos = 0; patos <= totalCabezas; patos++) { 
            int conejos = totalCabezas - patos;
            if (patos * 2 + conejos * 4 == totalPatas) {
                System.out.println("Patos: " + patos);
                System.out.println("Conejos: " + conejos);
                break;
            }
            else if (patos == totalCabezas) {
                System.out.println("No se puede determinar la cantidad de patos y conejos");
            }
        }
        
    }
}