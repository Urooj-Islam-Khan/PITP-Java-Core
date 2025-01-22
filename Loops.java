import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for loop

        // table

        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }

        System.out.println("\nTask 2");

        System.out.println("Enter a number from tale will start");
        int start = sc.nextInt();

        System.out.println("Enter a number from tale will end");
        int end = sc.nextInt();

        System.out.println("Enter a number of table");
        int tab_num = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(tab_num + "*" + i + "=" + (tab_num * i));
        }

        System.out.println("\nTask 3");
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println("");
        }

    }
}
