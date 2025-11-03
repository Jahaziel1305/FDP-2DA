import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuantas veces quieres repetir el patrón: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}