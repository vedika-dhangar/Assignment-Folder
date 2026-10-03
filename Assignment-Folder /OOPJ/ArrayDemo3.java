
import java.util.*;
class ArrayDemo2{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//2D array declaration
		int arr[][] = new int[3][3];//3X3 matrix : mat1
		int brr[][] = new int[3][3];//3X3 matrix : mat2
		int crr[][] = new int[3][3];//3X3 matrix : mat3
		
		//Input for array elements :m1
		for(int i=0;i<=2;i++)//Row declaration : i
		{
			for(int j=0;j<=2;j++){//Col declaration : j
				
			System.out.print("Enter element:");
			arr[i][j] = sc.nextInt();
			}

		}
		//Input for array elements :m2
		for(int i=0;i<=2;i++)//Row declaration : i
		{
			for(int j=0;j<=2;j++){//Col declaration : j
				
			System.out.print("Enter element:");
			arr[i][j] = sc.nextInt();
			}

		}
		crr[i][j]=0;
		
		//Multiplication		
		for(int i=0;i<=2;i++)//Row declaration : i
		{
			for(int j=0;j<=2;j++){//Col declaration : j
				
				for(int k=0;k<=2;k++){
				
				crr[i][j] = crr[i][j] + arr[i][k]*brr[k][j];
				}
			
			}

		}
	
		for(int ar[] : arr){
			for(int a : ar){
				System.out.print(" "+a);
			}
			System.out.println();
		
		}
		
			
		
	}
}