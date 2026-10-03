public class AttendanceReport{
            
    static int countPresent(int[] attendance){
         int count = 0;
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]==1){
                count++;
            }
            
        }
        System.out.println("Total days  : "+attendance.length);
        System.out.println("Total present days: "+count);

        return count;
    }
    static double percentage(int count,int totalDays){
        double percentage = (double) count/totalDays * 100;
        System.out.println("Attendance in % : "+percentage +"%");

        return percentage;
    }
    static void longestStreak(int[] attendance){
        int current=0;
        int best=0;
        int bestEnd=-1;
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]==1){
                current++;
            }
            else if(attendance[i]==0){
                best++;
            }
            if(current>best){
                best= current;
                bestEnd=i;
            }

    }
          int start = (bestEnd-best+1)+1;
          System.out.println("longest presence : "+current);
          System.out.println("longest absence  : "+best);
          System.out.println("streak start at  : "+start);
          System.out.println("End at day : "+bestEnd);


    }

    public static void main(String[] args){
        int[] attendance = {1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0};
       int count= countPresent(attendance);
        percentage(count,attendance.length);
        longestStreak(attendance);

    }

}