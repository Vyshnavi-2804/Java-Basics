import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered integer: " + num);

        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered double: " + doubleValue);

        sc.nextLine(); // Consume the newline character

        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();
        System.out.println("You entered string: " + stringValue);

        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("You entered boolean: " + booleanValue);

        sc.close();
    }
}