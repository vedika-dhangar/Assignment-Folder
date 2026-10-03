package emp;
public class Engineer extends Employee {

    private double overTime;

    public Engineer(String name, String address,
                    int age, boolean gender,
                    double basicSalary, double overTime) {

        super(name, address, age, gender, basicSalary);

        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    @Override
    public void display() {

        System.out.println("Employee Type : Engineer");
        System.out.println("Name          : " + getName());
        System.out.println("Salary        : " + getBasicSalary());
        System.out.println("Address       : " + getAddress());
        System.out.println("Age           : " + getAge());
        System.out.println("Gender        : " + getGender());
        System.out.println("OverTime      : " + getOverTime());
    }
}