package Assign;

public class Student {
	String name;
	int roll_no;
	String address;
	String ph_no;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name ="Vedika";
		s1.roll_no = 201;
		
		System.out.println("Name : " +s1.name);
		System.out.println("Roll No : " +s1.roll_no);
		
		Student s2 = new Student();
		Student s3 = new Student();
		
		s2.name ="Kanha";
		s2.roll_no = 1;
		s2.ph_no = "9876543258";
		s2.address = "Mumbai Maharashtra";
		
		s3.name ="RADHA";
		s3.roll_no = 2;
		s3.ph_no = "76568897634";
		s3.address = "PUNE Maharashtra";
		
		 System.out.println("************Student 1*********");
	        System.out.println("Name: " + s2.name);
	        System.out.println("Roll No: " + s2.roll_no);
	        System.out.println("Phone: " + s2.ph_no);
	        System.out.println("Address: " + s2.address);

	        System.out.println("\n*****Student 2***********");
	        System.out.println("Name: " + s3.name);
	        System.out.println("Roll No: " + s3.roll_no);
	        System.out.println("Phone: " + s3.ph_no);
	        System.out.println("Address: " + s3.address);
		
		
		
	}
	
	
	

}
