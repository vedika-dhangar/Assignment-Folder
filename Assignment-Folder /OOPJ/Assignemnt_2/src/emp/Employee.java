package emp;
public abstract class Employee {

    protected String name;
    protected String address;
    protected int age;
    protected boolean gender;
    protected double basicSalary;

    protected Employee(String name, String address,
                       int age, boolean gender,
                       double basicSalary) {

        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract void display();
}