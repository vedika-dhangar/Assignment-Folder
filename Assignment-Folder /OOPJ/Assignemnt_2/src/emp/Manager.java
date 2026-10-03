package emp;
public class Manager extends Employee {

    private double HRA;

    public Manager(String name, String address,
                   int age, boolean gender,
                   double basicSalary, double HRA) {

        super(name, address, age, gender, basicSalary);

        this.HRA = HRA;
    }

    public double getHra() {
        return HRA;
    }

    @Override
    public void display() {

        System.out.println("Employee Type : Manager");
        System.out.println("Name          : " + getName());
        System.out.println("Salary        : " + getBasicSalary());
        System.out.println("Address       : " + getAddress());
        System.out.println("Age           : " + getAge());
        System.out.println("Gender        : " + getGender());
        System.out.println("HRA           : " + getHra());
    }
}