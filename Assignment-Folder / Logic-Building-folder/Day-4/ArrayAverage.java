import java.util.Scanner;
class ArrayAverage{
	public static void main(String args[]){
        System.out.println("Enter Array elements :");
	Scanner sc = new Scanner(System.in);
	
	  int[] numbers = new int[5];
	 for(int i = 0; i<5; i++){
		numbers[i]=sc.nextInt();
	 }
         int sum = 0;
 	System.out.println("Average of Array elements :");
	for(int num : numbers){
           sum = sum+num;
	}
        System.out.println(sum/5);
	
     }
	
}