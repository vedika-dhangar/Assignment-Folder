#include <iostream>
#include <string>
using namespace std;

class Employee
{
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;
    static int employeeCount;

public:

    // Constructor
    Employee()
    {
        employeeCount++;
        empId = 1000 + employeeCount;
        isActive = true;
    }

    // Setter for name
    void setName(const string &n)
    {
        if (n == "")
        {
            cout << "Name should not be empty!" << endl;
        }
        else
        {
            name = n;
        }
    }

    // Setter for department
    void setDepartment(const string &dept)
    {
        if (dept == "HR" ||
            dept == "Engineering" ||
            dept == "Finance" ||
            dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << "Invalid Department !!" << endl;
        }
    }

    // Setter for grade
    void setGrade(char g)
    {
        if (g == 'A' ||
            g == 'B' ||
            g == 'C' ||
            g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "Not a valid grade!" << endl;
        }
    }

    // Setter for basic salary
    void setBasicSalary(double salary)
    {
        if (salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "Invalid salary!" << endl;
        }
    }

    // Getter for employee ID
    int getEmpId() const
    {
        return empId;
    }

    // Getter for name
    string getName() const
    {
        return name;
    }

    // Getter for department
    string getDepartment() const
    {
        return department;
    }

    // Deactivate employee
    void deactivate()
    {
        isActive = false;
    }

    // Getter for grade
    char getGrade() const
    {
        return grade;
    }

    // Getter for basic salary
    double getBasicSalary() const
    {
        return basicSalary;
    }

    // Calculate allowance
    double computeAllowance() const
    {
        if (grade == 'A')
        {
            return basicSalary * 0.40;
        }
        else if (grade == 'B')
        {
            return basicSalary * 0.30;
        }
        else if (grade == 'C')
        {
            return basicSalary * 0.20;
        }
        else
        {
            return basicSalary * 0.10;
        }
    }

    // Calculate gross salary
    double computeGrossSalary() const
    {
        return basicSalary + computeAllowance();
    }

    // Calculate tax
    double computeTax() const
    {
        double gross = computeGrossSalary();

        if (gross <= 50000)
        {
            return 0;
        }
        else if (gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    // Calculate net salary
    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }

    // Print payslip
    void printPayslip() const
    {
        cout << endl;
        cout << "========================================" << endl;
        cout << "                PAYSLIP" << endl;
        cout << "========================================" << endl;

        cout << "Employee ID    : " << empId << endl;
        cout << "Name           : " << name << endl;
        cout << "Department     : " << department << endl;
        cout << "Grade          : " << grade << endl;
        cout << "Basic Salary   : Rs. " << basicSalary << endl;

        cout << "Allowance      : Rs. "
             << computeAllowance() << endl;

        cout << "Gross Salary   : Rs. "
             << computeGrossSalary() << endl;

        cout << "Tax            : Rs. "
             << computeTax() << endl;

        cout << "Net Salary     : Rs. "
             << computeNetSalary() << endl;

        cout << "Status         : ";

        if (isActive)
        {
            cout << "Active" << endl;
        }
        else
        {
            cout << "Inactive" << endl;
        }

        cout << "========================================" << endl;
    }

    // Accept employee details
    void acceptDetails()
    {
        string n;
        string dept;
        char g;
        double salary;

        cout << endl;

        cout << "Enter name: ";
        getline(cin >> ws, n);
        setName(n);

        cout << "Enter department: ";
        getline(cin >> ws, dept);
        setDepartment(dept);

        cout << "Enter grade: ";
        cin >> g;
        setGrade(g);

        cout << "Enter basic salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }

    // Static function
    static int getEmployeeCount()
    {
        return employeeCount;
    }

    // Destructor
    ~Employee()
    {
        cout << "Destructor called" << endl;
    }
};

// Definition of static data member
int Employee::employeeCount = 0;


// Main function
int main()
{
    Employee e1;

    e1.getName();
    e1.acceptDetails();

    cout << "======================================" << endl;

    e1.printPayslip();

    cout << "======================================" << endl;


    Employee *e2 = new Employee();

    e2->getName();
    e2->acceptDetails();

    cout << "======================================" << endl;

    e2->printPayslip();

    cout << "======================================" << endl;


    delete e2;

    return 0;
}