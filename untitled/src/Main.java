import java.util.Locale;
import java.util.Scanner;

public class Main {
    public Main(){
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter Age: 0 - 100?: ");
        int age = scanner.nextInt();
        if (age > 100){
            System.out.println("Error");
        }

        System.out.print("Enter Employee Number (27560000-27569999): ");
        int employeeNumber = scanner.nextInt();

        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@mentormakers.com";

        System.out.println("Employee Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Email: " + email);


    }
}