
import java.util.*;
class ArrayDemo{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0;i<3;i++){
			System.out.println("Enter element:");
			arr[i] = sc.nextInt();
		
		
		}
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		
		}
		
	}
}