import java.util.Scanner;

public class ConditionStatementLec {
    public static void main(String[] args) {

        int age = 21;

        // if else
        if (age >= 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are under age");
        }

        // else if
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a < 10) {
            System.out.println(a + " is less than 10");
        } else if (a > 10) {
            System.out.println(a + " is grater than 10");
        } else {
            System.out.println(a + " is equal to 10");
        }

        // switch

        System.out.println("Enter any number 1 to 7: ");
        int num = sc.nextInt();

        switch (num) {
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
                System.out.println("wrong input");
                break;
        }

    }

}
