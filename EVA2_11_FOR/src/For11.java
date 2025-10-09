package EVA2_11_FOR.src;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        int num1, num2, resi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero (INICIO): ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el numero (FINAL): ");
        num2 = teclado.nextInt();
        for (int i = num1; i <= num2; i++) {
            resi = i % 2;
            if (resi == 0)
                System.out.print(i + " - ");
        }
    }
}