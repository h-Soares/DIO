import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            int number = scan.nextInt();
            System.out.print("Enter agency: ");
            String agency = scan.next();
            System.out.print("Enter client name: ");
            scan.nextLine();
            String clientName = scan.nextLine();
            System.out.print("Enter balance: ");
            BigDecimal balance = scan.nextBigDecimal();

            System.out.println(System.lineSeparator() + "Hello " + clientName + ", thank you for creating an account at our bank, " +
                    "your agency is " + agency + ", account " + number + " and your balance " +
                    NumberFormat.getCurrencyInstance(Locale.getDefault()).format(balance) + " is now available for withdraw.");
        }catch(InputMismatchException e) {
            System.out.println("Invalid number or balance!");
        }

        scan.close();
    }
}