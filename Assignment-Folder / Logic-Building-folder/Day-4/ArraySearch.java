import java.util.*;

class ArraySearch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Integer[] numbers = new Integer[5];

        System.out.println("Enter 5 integers:");

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int search = sc.nextInt();

        List<Integer> list = Arrays.asList(numbers);

        if(list.contains(search)) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}