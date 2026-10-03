
import java.util.*;
class ArrayDemo2{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//2D array declaration
		int arr[][] = new int[3][3];//3X3 matrix
		
		//Input for array elements
		for(int i=0;i<=2;i++)//Row declaration : i
		{
			for(int j=0;j<=2;j++){//Col declaration : j
				
			System.out.print("Enter element:");
			arr[i][j] = sc.nextInt();
			}

		}
		arr[1][1]=100;
		
		
		/*for(int i=1;i<=2 ;i++){
			for(int j=1;j<=2;j++){
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for(int ar[] : arr){
			for(int a : ar){
				System.out.print(" "+a);
			}
			System.out.println();
		
		}
		System.out.println(arr[2][2]);
			
		
	}
}