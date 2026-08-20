import java.util.Scanner;
class Sumofnum{

      static int calculateSum(int n){
            int sum = 0;
            for(int i=1; i<=n; i++)    //i[0]+i[1]+i[2]+[3]
                  {
                        sum = sum+i;   //1+2+3+4+5 = 15
                  }
            return sum;
      }
      public static void main(String args[]){
            System.out.println("Enter number  : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
  
            System.out.println("Sum: " +Sumofnum.calculateSum(n));
            }
}