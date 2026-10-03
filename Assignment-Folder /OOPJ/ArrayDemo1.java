
import java.util.*;
class ArrayDemo1{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter element:");
			arr[i] = sc.nextInt();

		}
		//for-each: print the array elements
		for(int x : arr){
			System.out.println(x);
		}
		
		/*for(int i=0;i<arr.length ;i++){
			System.out.println(arr[i]);
		
		}*/
		
	}
}