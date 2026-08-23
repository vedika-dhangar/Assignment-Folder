import java.util.Scanner;

class ReverseString {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String name = sc.nextLine();

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse = reverse + name.charAt(i);
        }

        System.out.println("Reverse of " + name + " is " + reverse);
    }
}