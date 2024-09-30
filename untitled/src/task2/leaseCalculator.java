package task2;

import java.util.Scanner;

public class leaseCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total leased money: ");
        double totalLeasedMoney = scanner.nextDouble();

        System.out.println("Enter down payment: ");
        double downPayment = scanner.nextDouble();

        int monthLeaseTerm = 0;
        while (monthLeaseTerm < 1) {
            System.out.println("Enter your lease term (as the month name, e.g., January, February, etc.): ");
            String month = scanner.nextLine().trim().toLowerCase();

            switch (month) {
                case "january":
                    monthLeaseTerm = 1;
                    break;
                case "february":
                    monthLeaseTerm = 2;
                    break;
                case "march":
                    monthLeaseTerm = 3;
                    break;
                case "april":
                    monthLeaseTerm = 4;
                    break;
                case "may":
                    monthLeaseTerm = 5;
                    break;
                case "june":
                    monthLeaseTerm = 6;
                    break;
                case "july":
                    monthLeaseTerm = 7;
                    break;
                case "august":
                    monthLeaseTerm = 8;
                    break;
                case "september":
                    monthLeaseTerm = 9;
                    break;
                case "october":
                    monthLeaseTerm = 10;
                    break;
                case "november":
                    monthLeaseTerm = 11;
                    break;
                case "december":
                    monthLeaseTerm = 12;
                    break;
                default:
                    System.out.println("Invalid month. Please enter a valid month name.");
            }
        }

        System.out.println("Enter your interest % rate: ");
        double interestRate = scanner.nextDouble();

        double monthlyPayment = ((totalLeasedMoney - downPayment) + ((totalLeasedMoney - downPayment) *
                (interestRate / 100))) / monthLeaseTerm;

        System.out.printf("The monthly payment is: %.2f%n", monthlyPayment);

    }
}
