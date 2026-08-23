class PatternLast {
    public static void main(String args[]) {

        // Increasing part
        for(int i = 1; i <= 6; i++) {

            for(int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Decreasing part
        for(int i = 5; i >= 1; i--) {

            for(int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}