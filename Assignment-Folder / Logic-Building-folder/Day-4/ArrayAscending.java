import java.util.*;

public class ArrayAscending {
    public static void main(String[] args) {
        System.out.println("Enter Array elements :");
	Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
	for(int i = 0; i < numbers.length; i++) {
         numbers[i]=sc.nextInt();
	}
        Arrays.sort(numbers);
        
        System.out.println(Arrays.toString(numbers)); 
    }
}
