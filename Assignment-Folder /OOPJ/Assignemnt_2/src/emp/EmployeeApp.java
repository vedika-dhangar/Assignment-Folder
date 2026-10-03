package emp;
public class EmployeeApp {
	

    public static final int ADD_EMPLOYEE = 1;
    public static final int DISPLAY = 2;
    public static final int SORT = 3;
    public static final int SAVE = 4;
    public static final int LOAD = 5;
    public static final int EXIT = 6;

    public static final int ADD_MANAGER = 1;
    public static final int ADD_ENGINEER = 2;
    public static final int ADD_SALESPERSON = 3;

    public static void main(String[] args) {

        Employee[] arrEmployee = new Employee[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");

            System.out.println("Enter your choice");
            choice = ConsoleInput.getInt();


            // =========================
            // ADD EMPLOYEE
            // =========================

            if (choice == ADD_EMPLOYEE) {

                System.out.println("\n1. Manager");
                System.out.println("2. Engineer");
                System.out.println("3. Sales Person");
                System.out.println("4. Exit to Main Menu");

                int empChoice = ConsoleInput.getInt();


                // =========================
                // ADD MANAGER
                // =========================

                if (empChoice == ADD_MANAGER) {

                    System.out.println("How many Managers?");
                    int number = ConsoleInput.getInt();

                    for (int i = 0; i < number; i++) {

                        System.out.println("Enter the name");
                        String name = ConsoleInput.getString();

                        System.out.println("Enter the address");
                        String address = ConsoleInput.getString();

                        System.out.println("Enter the age");
                        int age = ConsoleInput.getInt();

                        System.out.println("Enter the Basic Salary");
                        double basicSalary = ConsoleInput.getDouble();

                        System.out.println("Enter the HRA");
                        double hra = ConsoleInput.getDouble();


                        arrEmployee[count++] =
                            new Manager(
                                name,
                                address,
                                age,
                                true,
                                basicSalary,
                                hra
                            );
                    }
                }


                // =========================
                // ADD ENGINEER
                // =========================

                else if (empChoice == ADD_ENGINEER) {

                    System.out.println("How many Engineers?");
                    int number = ConsoleInput.getInt();

                    for (int i = 0; i < number; i++) {

                        System.out.println("Enter the name");
                        String name = ConsoleInput.getString();

                        System.out.println("Enter the address");
                        String address = ConsoleInput.getString();

                        System.out.println("Enter the age");
                        int age = ConsoleInput.getInt();

                        System.out.println("Enter the Basic Salary");
                        double basicSalary = ConsoleInput.getDouble();

                        System.out.println("Enter the OverTime");
                        double overTime = ConsoleInput.getDouble();


                        arrEmployee[count++] =
                            new Engineer(
                                name,
                                address,
                                age,
                                true,
                                basicSalary,
                                overTime
                            );
                    }
                }


                // =========================
                // ADD SALES PERSON
                // =========================

                else if (empChoice == ADD_SALESPERSON) {

                    System.out.println("How many Sales Persons?");
                    int number = ConsoleInput.getInt();

                    for (int i = 0; i < number; i++) {

                        System.out.println("Enter the name");
                        String name = ConsoleInput.getString();

                        System.out.println("Enter the address");
                        String address = ConsoleInput.getString();

                        System.out.println("Enter the age");
                        int age = ConsoleInput.getInt();

                        System.out.println("Enter the Basic Salary");
                        double basicSalary = ConsoleInput.getDouble();
                        
                        System.out.println("Enter the Commission");
                        double commission = ConsoleInput.getDouble();


                        arrEmployee[count++] =
                            new SalesPerson(
                                name,
                                address,
                                age,
                                true,
                                basicSalary,
                                commission
                            );
                    }
                }
            }


            // =========================
            // DISPLAY
            // =========================

            else if (choice == DISPLAY) {

                if (count > 0) {

                    for (int iTmp = 0;
                         iTmp < count;
                         iTmp++) {

                        System.out.println();

                        System.out.println(
                            "Name    : " +
                            arrEmployee[iTmp].getName()
                        );

                        System.out.println(
                            "Address : " +
                            arrEmployee[iTmp].getAddress()
                        );

                        System.out.println(
                            "Age     : " +
                            arrEmployee[iTmp].getAge()
                        );

                        System.out.println(
                            "Salary  : " +
                            arrEmployee[iTmp].getBasicSalary()
                        );


                        // -------------------------
                        // MANAGER
                        // -------------------------

                        if (arrEmployee[iTmp] instanceof Manager) {

                            Manager objManager =
                                (Manager) arrEmployee[iTmp];

                            System.out.println(
                                "HRA : " +
                                objManager.getHra()
                            );

                            System.out.println(
                                "It's a Manager"
                            );
                        }


                        // -------------------------
                        // ENGINEER
                        // -------------------------

                        else if (arrEmployee[iTmp]
                                 instanceof Engineer) {

                            Engineer objEngineer =
                                (Engineer) arrEmployee[iTmp];

                            System.out.println(
                                "OverTime : " +
                                objEngineer.getOverTime()
                            );

                            System.out.println(
                                "It's an Engineer"
                            );
                        }


                        // -------------------------
                        // SALES PERSON
                        // -------------------------

                        else if (arrEmployee[iTmp]
                                 instanceof SalesPerson) {

                            System.out.println(
                                "It's a Sales Person"
                            );
                        }


                        System.out.println(
                            "----------------------------"
                        );
                    }
                }

                else {

                    System.out.println(
                        "No employees available."
                    );
                }
            }


        } while (choice != EXIT);

    }
}