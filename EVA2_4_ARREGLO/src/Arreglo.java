public class Arreglo {
    public static void main(String[] args) {
        int arreglo[] = new int[5]; // ocupa 5*4 bytes = 20 bytes
        // Primer elemento delarreglo--> 0 cero
        // Ultimo elemento --> tamaño -1
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        System.out.println("arreglo[2] = " + arreglo[2]);
        System.out.println("arreglo[3] = " + arreglo[3]);
        System.out.println("arreglo[4] = " + arreglo[4]);
        System.out.println("arreglo[5] = " + arreglo[5]);
        System.out.println("arreglo[6] = " + arreglo[6]);
    }
}