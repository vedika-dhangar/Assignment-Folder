import java.util.Scanner;
class CountVowels{
       public static void main(String args[]){
	System.out.println("Enter String :");
    	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int count=0;
        	
	 
	 for(int i = 0; i<name.length(); i++){
		char ch = name.charAt(i);
              if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
              || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
		count++;
		}
         	
	 }
	System.out.println("Vowels in the string : " +name +" are = " +count);	
 	
     }		
	
   
}	