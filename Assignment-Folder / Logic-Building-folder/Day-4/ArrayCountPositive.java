import java.util.Scanner;
class ArrayCountPositive{
	public static void main(String args[]){
        System.out.println("Enter Array elements :");
	Scanner sc = new Scanner(System.in);
	
	  int[] numbers = new int[5];
	 for(int i = 0; i<5; i++){
		numbers[i]=sc.nextInt();
	 }
	 int positive = 0;
	 int negative = 0;
 	System.out.println("Array elements are:");
	for(int num : numbers){
	   if(num > 0){
		 positive++;
		}else 
                   negative++;
	}
	System.out.println("Postive numbers are : " +positive);
        System.out.println("Negative numbers are : " +negative);

     }
	
}