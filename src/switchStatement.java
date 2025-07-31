import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args) {
        // Importing Scanner for user input
        // -------------------------------------------------------------
        try(Scanner scnr = new Scanner(System.in)) {

            // Define variables
            // -------------------------------------------------------------
            int day;
            String dayName;

            // Prompting user for input
            // -------------------------------------------------------------
            System.out.print("Enter a day (1-7): ");
            day = scnr.nextInt();

            // Using switch statement to determine the day of the week
            // -------------------------------------------------------------

            switch (day) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day";
            }

            System.out.println("Day " + day + " is: " + dayName);
        }
    }
}
