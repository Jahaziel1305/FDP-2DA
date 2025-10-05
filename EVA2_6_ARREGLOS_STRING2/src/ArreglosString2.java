import java.util.Scanner;

public class ArreglosString2 {
    public static void main(String[] args) {
        String diasSemana[] = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
        System.out.println("Introduce el dia de la semana en numero (0-6): ");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        System.out.println("El dia de la semana es " + diasSemana[dia]);
    }
}