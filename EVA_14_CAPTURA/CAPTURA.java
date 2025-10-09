package EVA_14_CAPTURA;

import java.util.Scanner;

public class CAPTURA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tama;
        System.out.println("Cuantas calificaciones necesitas?");
        tama = teclado.nextInt();
        int califas[] = new int[tama];
        for (int i = 0; i < califas.length; i++) {
            System.out.println(" Calificación " + (i + 1) + ":");
            califas[i] = teclado.nextInt();
        }
        for (int i = 0; i < califas.length; i++) {
            System.out.print("[" + califas[i] + "]");
        }
    }
}