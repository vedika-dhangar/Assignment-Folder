

public class DateMain {

    public static void main(String[] args) {

        Date d = new Date();

        DateOperations operation =
            new DateOperations();

        int choice;

        do {

            System.out.println();
            System.out.println("================================");
            System.out.println("Date Menu");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates (not implement)");
            System.out.println("7. Exit");
            System.out.println("--------------------------------");

            choice = Console.getInt("Enter choice: ");


            switch (choice) {

                case 1:

                    int dd = Console.getInt("Enter day: ");
                    int mm = Console.getInt("Enter month: ");
                    int yy = Console.getInt("Enter year: ");

                    d.setDate(dd, mm, yy);

                    break;


                case 2:

                    int days =
                        Console.getInt("Enter number of days: ");

                    operation.addDays(d, days);

                    break;


                case 3:

                    int months =
                        Console.getInt("Enter number of months: ");

                    operation.addMonths(d, months);

                    break;


                case 4:

                    int years =
                        Console.getInt("Enter number of years: ");

                    operation.addYears(d, years);

                    break;


                case 5:

                    System.out.print("Date: ");

                    d.display();

                    break;


                case 6:

                    System.out.println(
                        "Compare Dates not implemented."
                    );

                    break;


                case 7:

                    System.out.println(
                        "Thank you!"
                    );

                    break;


                default:

                    System.out.println(
                        "Invalid choice."
                    );
            }

        } while (choice != 7);
    }
}