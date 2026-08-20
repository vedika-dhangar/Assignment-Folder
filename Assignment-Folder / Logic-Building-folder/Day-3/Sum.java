import java.util.Scanner;
class Sum{

   static int sumOfTwonumbers(int a, int b){
    System.out.println("your value is : ");
     return a + b;
}    
      
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value of a :");
    int a = sc.nextInt();

    System.out.println("Enter Value of b :");
    int b = sc.nextInt();

     System.out.println(sumOfTwonumbers(a, b));
    }
  }





