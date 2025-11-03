import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, adivinar;
        adivinar = (int) (Math.random() * 5 + 1);
        while (true) {
            System.out.println("Adivina el numero. -1 para terminar");
            valor = teclado.nextInt();
            if (valor == adivinar) {
                System.out.println("Felicidades, adivinaste");
                break;
            }
            if (valor == -1) {
                System.out.println("Gracias por jugar");
                break;
            }
            System.out.println("Vuelve a intentarlo");
        }
    }
}