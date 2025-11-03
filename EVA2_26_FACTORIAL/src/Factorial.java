import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Introduce el numero para sacar su factorial: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Su factorial es " + factorial);
    }
}