import java.util.Scanner;
class ArrayNum{
	public static void main(String args[]){
        System.out.println("Enter Array elements :");
	Scanner sc = new Scanner(System.in);
	
	  int[] numbers = new int[5];
	 for(int i = 0; i<5; i++){
		numbers[i]=sc.nextInt();
	 }
 	System.out.println("Array elements are:");
	for(int num : numbers){
	System.out.println(num);
	}
	
     }
	
}