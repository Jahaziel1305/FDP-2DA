public class Continue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            i++;
            if (i % 2 != 0)// NO DIVISIBLE ENTRE 2
            {
                continue;
            }
            System.out.print(i + "-");
        }
        /*
         * int i = 1;
         * while (i <= 100) {
         * if (i % 2 == 0) {
         * System.out.println(i);
         * }
         * i++;
         */
    }
}