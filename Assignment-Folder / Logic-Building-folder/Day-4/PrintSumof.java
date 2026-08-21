import java.util.Scanner;
class PrintSumof{
	public static void main(String[] args){
	System.out.println("Enter a number : ");	
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
		
		for(int i = 1; i<=n; i++){
                        if(i%2==1){
				sum = sum+i;
 				}
                        }
                System.out.print("Sum of odd all numbers is : " +sum);
                     }
         
}
