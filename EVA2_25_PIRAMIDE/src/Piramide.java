import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        System.out.println("Introduce cuantos * quieres que tenga la altura de tu piramide: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}