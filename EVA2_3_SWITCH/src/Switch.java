public class Switch {
    public static void main(String[] args) {
        String cade = "Lunes";
        switch (cade) {
            case "Lunes":
                System.out.println(1);
                break;
            case "Martes":
                System.out.println(2);
            default:
                System.out.println("Dia no existente");
                break;
        }
    }
}