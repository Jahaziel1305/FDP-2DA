import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usu, contra;
        do {
            System.out.println("Introduce tu usuario: ");
            usu = teclado.nextLine();
            System.out.println("Introduce tu contraseña: ");
            contra = teclado.nextLine();
        } while (!(usu.equals("admin") && contra.equals("admin")));
        if (usu.equals("admin") && contra.equals("admin"))
            System.out.println("Acceso concedido. Bienvenido al sistema");
        else
            System.out.println("Acceso denegado");
    }
}