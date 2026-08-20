import java.util.Scanner;
class Age{

   static void checkAgeCategory(int age){
     String result = (age>100) ?  "Not A valid Age" : (age>=60) ? "Senior Citizen " : (age>=18) ? "Adult" :  "Minor"  ;
     
     System.out.println(result);
    }    
      
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age :");
       int age = sc.nextInt();

       checkAgeCategory(age);
       

  }
}