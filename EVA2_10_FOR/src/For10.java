import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            System.out.print(i + " - ");
        System.out.println("");
        for (int i = 0; i <= 50; i += 2)
            System.out.print(i + " - ");
        System.out.println("");

        for (int i = 100; i >= 1; i -= 2)
            System.out.print(i + " - ");
        System.out.println("");

        int valor2;
        int valo;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero a iniciar: ");
        valo = input.nextInt();
        System.out.println("Introduce el numero donde quieres que termien: ");
        valor2 = input.nextInt();
        for (int i = valo; valo < valor2; valo++)
            System.out.print(valo + " - ");
    }
}