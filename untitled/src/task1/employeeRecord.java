package task1;

import java.util.Scanner;

public class employeeRecord {
    public static void Main(){
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last Name: ");
        String lastName = scanner.nextLine();

        int age = -1;
        while (age < 0 || age > 100) {
            System.out.print("Enter Age (0-100): ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 0 || age > 100) {
                    System.out.println("Invalid age. Please enter a number between 0 and 100.");
                }
            }
        }


        int employeeNumber = 0;
        while (employeeNumber < 27560000 || employeeNumber > 27569999) {
            System.out.print("Enter Employee Number (27560000-27569999): ");
            if (scanner.hasNextInt()) {
                employeeNumber = scanner.nextInt();
                if (employeeNumber < 27560000 || employeeNumber > 27569999) {
                    System.out.println("Invalid employee number.");
                }
            }
        }


            String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com";

            System.out.println("Employee Information:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Employee Number: " + employeeNumber);
            System.out.println("Email: " + email);

            scanner.close();
        }
    }

