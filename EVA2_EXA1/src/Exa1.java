import java.util.Scanner;

public class Exa1 {

    public static void main(String[] args) {
        int pin;
        System.out.println("Introduce tu pin");
        Scanner teclado = new Scanner(System.in);
        pin = teclado.nextInt();
        if (pin == 1234) {
            int menu;
            System.out.println("1. Consultar saldo "
                    + " 2. Retirar dinero"
                    + " 3. Depositar dinero");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Tu saldo es: " + 5000);
                    break;
                case 2:
                    System.out.println("Cual es el monto que deseas retirar");
                    double retiro = teclado.nextDouble();
                    if (retiro <= 5000) {
                        double saldo1 = 5000 - retiro;
                        System.out.println("Tu saldo es: " + saldo1);
                        break;
                    } else {
                        System.out.println("No cuentas con el saldo suficiente");
                        break;
                    }
                case 3:
                    System.out.println("Cual es el monto que deseas ingresar");
                    double montoingresar = teclado.nextDouble();
                    if (montoingresar > 1) {
                        double saldo2 = montoingresar + 5000;
                        System.out.println("Tu saldo actual es: " + saldo2);
                        break;
                    } else {
                        System.out.println("Monto invalido");
                    }
                default:
                    System.out.println("Opcion invalida");
            }
        } else {
            System.out.println("Acceso denegado");
        }
    }
}