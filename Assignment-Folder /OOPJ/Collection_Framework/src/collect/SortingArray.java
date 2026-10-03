package collect;
import java.util.ArrayList;
import java.util.Collections;


public class SortingArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<String> names = new ArrayList<String>();
		
		names.add(" Vedika ");
		names.add(" Shreya ");
		names.add(" Disha ");
		names.add(" Siddhi ");
		names.add(" Vedika ");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println("Soretd names : " + names);
		
		Collections.sort(names, Collections.reverseOrder());
		
		System.out.println("Reverse Soretd names : " + names);

		
		
		// TODO Auto-generated method stub
		numbers.add(50);
		numbers.add(45);
		numbers.add(33);
		numbers.add(77);
		numbers.add(10);
		
		System.out.println(numbers);
		
		Collections.sort(numbers);
		
		System.out.println("Sorted numbers : "+ numbers);
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Reverse Sorted numbers : "+ numbers);
		
		

	}

}
