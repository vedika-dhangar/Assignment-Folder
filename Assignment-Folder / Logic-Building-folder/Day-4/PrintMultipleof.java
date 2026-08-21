import java.util.Scanner;
class PrintMultipleof{
	public static void main(String[] args){
	System.out.println("Enter a number : ");	
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++){
                        if(i%3==0){
			System.out.print(i +" ");
                        }
                     }
         }
}
