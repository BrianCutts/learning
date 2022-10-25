package newStuff;


import java.text.NumberFormat;
import java.util.Scanner;

public class MoshExamplesPart1 {
    public static void main(String[] args) {
        NumberFormat calculated = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;

        while(true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Please choose an amount between $1,000 and $1,000,000");
        }

        System.out.print("Annual Interest Rate: " );
        double interestAnnualRate = scanner.nextDouble();

        double interestRate = interestAnnualRate / 100 / 12;

        System.out.print("Period (Years): " );
        int payYears = scanner.nextInt();

        int period = payYears * 12;

        double onePlus = 1 + interestRate;

        double exponent = Math.pow(onePlus, period);

        double mortgage = principal * (((interestRate * exponent)) / (exponent - 1));

        String result = calculated.format(mortgage);

        System.out.println("Mortgage: " + result);

        scanner.close();



    }
    }


