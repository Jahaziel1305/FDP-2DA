import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        int num1, resu;
        System.out.println("Introduce un numero entero");
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            resu = num1 * i;
            System.out.println(num1 + "x" + i + " = " + resu);
        }
    }
}