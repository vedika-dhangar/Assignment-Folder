class CalAverage{
        
    public static void main(String args[]){

            int Maths = 84;
            int Sci = 70;
            int History = 85;

            int avg = (Maths+Sci+History)/3;

        if(avg>=90){
            System.out.println("Grade A " +avg);
        }else if(avg>70 && avg<89)
            System.out.println("Grade B " +avg);

            else if(avg>50 && avg<69)
            System.out.println("Grade c " +avg);

            else if(avg>30 && avg<49)
            System.out.println("Grade D " +avg);
        
             else if(avg < 30)
                System.out.println("you are failed" +avg);
            }
        }
