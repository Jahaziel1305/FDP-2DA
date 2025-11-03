import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, posi = -1; // -1 significa que no lo encontramos
        int datos[] = new int[10];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor a buscar: ");
        valor = teclado.nextInt();
        // Busqueda lineal
        for (int i = 0; i < datos.length; i++) {
            if (valor == datos[i]) {// Lo encontramos
                posi = i;
                break;
            }
        }
        System.out.println("Posición: " + (posi + 1));
    }
}