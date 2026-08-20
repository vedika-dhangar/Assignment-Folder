import java.util.Scanner;

class Table{


     static void printMulTable(int num){

      for(int i=1; i<=10; i++){
         System.out.println(+num +" * " +i +" = " +(num * i)   );
     }
    }

     public static void main(String[] args){
     System.out.println("Enter number of Table you want to print "); 
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
   
      
     printMulTable(num);

   }

 }
