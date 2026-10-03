package Assign;

public class DateOperations {
	public boolean isLeapYear(int year) {
		if(year % 400 == 0 || year % 4 == 0 ) 
			return true;
		
		if(year % 100 == 0) 
			return false;
		
		return false;
	}
	
	public int daysInMonth(int month, int year) {
		if(month==2 && isLeapYear(year))
			return 29;
		
		int days[] = {            
				0, 31, 28, 31, 30, 31, 30,
	            31, 31, 30, 31, 30, 31
	};
		return days[month];
	}
	
	public void addDays(Date d, int days) {
		while(days>0) {
			int totalDays = daysInMonth(d.getMonth(),d.getYear());
			if(d.getDay() + days <= totalDays) {
				d.setDate(d.getDay() + days, d.getMonth(), d.getYear());
				days = 0;
			}
			else {
				days = days - (totalDays- d.getDay()+1);
				if(d.getMonth()==12) {
					d.setDate(1, 1, d.getYear()+1);
				}
				else {
					d.setDate(1, d.getMonth()+1, d.getYear());
				}
			}
		}
	}
	
	public void addMonth(Date d, int months) {
		int newMonth = d.getMonth();
		int newYear = d.getYear();
		
		newMonth = newMonth + months;
		while(newMonth > 12) {
			newMonth = newMonth - 12;
			newYear++;
		}
		int maxDays = daysInMonth(newMonth, newYear);
		
		int newDay = d.getDay();
		
		if(newDay > maxDays)
			newDay = maxDays;
		
		d.setDate(newDay, newMonth, newYear);
	}
	
	public void addyears(Date d ,int years) {
		int newYear = d.getYear() + years;
		int newDay = d.getDay();
		
		if (d.getMonth() == 2 &&
	         d.getDay() == 29 &&
	         !isLeapYear(newYear)) {

	         newDay = 28;
	      }
	        d.setDate(
            newDay,
            d.getMonth(),
            newYear
		   );
	}
}

