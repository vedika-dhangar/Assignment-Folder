import java.util.*;

class DateDemo1{

	public static void main(String args[]){
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Year = "+cal.get(Calendar.YEAR));
		System.out.println("Month = "+(cal.get(Calendar.MONTH)+1));//0-based
		System.out.println("Day = "+cal.get(Calendar.DAY_OF_MONTH));
		//System.out.println("Now in ms = "+now.getTime());
		
		System.out.println(cal.add(Calendar.DAY_OF_MONTH, 7));
		System.out.println("After 7 days: "+ cal.getTime());
				
	
		
	
	}
}