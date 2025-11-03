import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double saldo = 1000000, retiro;
        do {
            System.out.println("Tu saldo es de " + (int) saldo);
            System.out.println("Cuanto desea retirar? ");
            Scanner teclado = new Scanner(System.in);
            retiro = teclado.nextDouble();
            saldo = saldo - retiro;
        } while (saldo >= 0);
        System.out.println("Tu saldo quedo en " + saldo);
    }
}