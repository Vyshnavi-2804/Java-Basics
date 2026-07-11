import java.util.Scanner;
public class Condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        //if condition
        if(number < 0){
            System.out.println("Negative number");
        }
        //else if condition
        else if(number > 0){
            System.out.println("Positive number");
        }
        //else condition
        else{
            System.out.println("Zero");
        }


        //if-else-if ladder
        if(number % 2 == 0){
            System.out.println(number + " is Even Number");
        }
        else if(number % 2 != 0){
            System.out.println(number + " is Odd Number");
        }
        else{
            System.out.println("Not a valid number");
        }

        //switch case
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();
     switch(day){
         case 1:
             System.out.println("Monday");
             break;
         case 2:
             System.out.println("Tuesday");
             break;
         case 3:
             System.out.println("Wednesday");
             break;
         case 4:
             System.out.println("Thursday");
             break;
         case 5:
             System.out.println("Friday");
             break;
         case 6:
             System.out.println("Saturday");
             break;
         case 7:
             System.out.println("Sunday");
             break;
         default:
             System.out.println("Invalid day number");  
     }
     //nested if 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            if(age >= 65){
                System.out.println("you are senior citizen.");
            } else {
                System.out.println("You are an adult");
            }
        } else {
            if(age >= 13){
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are a child.");
            }
        }
        sc.close();
    }

}