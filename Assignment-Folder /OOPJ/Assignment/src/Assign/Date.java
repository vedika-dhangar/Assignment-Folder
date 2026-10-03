package Assign;

public class Date {
	private int day;
	private int month;
	private int year;
	
	int daysinmonth[]= {
		    0, 31, 28, 31, 30, 31, 30,
		    31, 31, 30, 31, 30, 31
		};

	public void setDate(int dd, int mm, int yy) {
		year = yy;
		if(mm < 1 || mm > 12) 	
			month = 1;
		else
			month = mm;
		if(dd < 1 || dd > daysinmonth[month])
			day = 1;
		else
			day = dd;
		if(yy < 1950 || yy >2030 )
			yy = 2026;
		else
			year = yy;
		}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public void display() {
		System.out.println(day + "/" + month + "/" + year);
	}
	
	
}
