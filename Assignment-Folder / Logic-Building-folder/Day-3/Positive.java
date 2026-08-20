import java.util.Scanner;
class Positive{

     static void askForPositiveNumber(){

          Scanner sc = new Scanner(System.in);
          int i;
               
          do {
                    System.out.println("Enter a Positive number : ");
                     i = sc.nextInt();
             }
         while(i<=0);
         System.out.println("you have entered a Positive number : "+ i);        }
     public static void main(String[] args){
         
      
        askForPositiveNumber();

    }

}