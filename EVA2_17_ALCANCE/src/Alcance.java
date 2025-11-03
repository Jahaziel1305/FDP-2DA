public class Alcance {
    public static void main(String[] args) {
        int i = 5;
        {
            System.out.println(i);
            int valor = 100;
            System.out.println(valor);
        }
        System.out.println(valor);
    }
}
