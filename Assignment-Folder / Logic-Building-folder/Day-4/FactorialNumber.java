import java.util.Scanner;
class FactorialNumber{
	

        public static void main(String[] args){
	System.out.println("Enter a number : ");	
	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long fact = 1;
        
		
		for(int i = 1; i<=n; i++){
			fact *=i;			
                     }

               System.out.print("Factorial of  "+n +"! is : " +fact);

         }
}
