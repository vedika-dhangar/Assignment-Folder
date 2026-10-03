package emp;
public class SalesPerson extends Employee {
	private double commission;
   
    public SalesPerson(String name, String address,
                       int age, boolean gender,
                       double basicSalary,double commission) {

        super(name, address, age, gender, basicSalary);
        this.commission = commission;
    }
	public double getCommission() {
		return commission;
	}


    @Override
    public void display() {

        System.out.println("Employee Type : Sales Person");
        System.out.println("Name          : " + getName());
        System.out.println("Salary        : " + getBasicSalary());
        System.out.println("Address       : " + getAddress());
        System.out.println("Age           : " + getAge());
        System.out.println("Gender        : " + getGender());
        System.out.println("Commission    : " + getCommission());
    }


}