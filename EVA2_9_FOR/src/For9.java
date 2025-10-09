import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir: ");
        mensaje = teclado.nextLine();
        System.out.println("Cantidad de repeticiones: ");
        rep = teclado.nextInt();
        for (int i = 1; i <= rep; i++) {
            System.out.println(mensaje);
        }
    }
}