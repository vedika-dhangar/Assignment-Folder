import java.util.Scanner;
class ArrayName{
	public static void main(String args[]){
        System.out.println("Enter Array elements :");
	Scanner sc = new Scanner(System.in);
	
	  String[] names = new String[5];
	 for(int i = 0; i<5; i++){
		names[i]=sc.nextLine();
	 }
 	System.out.println("Array elements are:");
	for(String name : names){
	System.out.println(name);
	}
	
     }
	
}