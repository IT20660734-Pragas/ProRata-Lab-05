import java.util.Scanner;

public class IT20660734Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        int startDate, endDate;
        int daysReserved;
        double totalAmount;
        double discount = 0;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        daysReserved = endDate - startDate;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = 0.10;
        }
        else if (daysReserved >= 5) {
            discount = 0.20;
        }

        totalAmount = (daysReserved * ROOM_CHARGE)
                - (daysReserved * ROOM_CHARGE * discount);

        System.out.println("\nRoom Charge Per Day: Rs. "
                + ROOM_CHARGE);

        System.out.println("Number of Days Reserved: "
                + daysReserved);

        System.out.println("Total Amount to be Paid: "
                + totalAmount);
    }
}