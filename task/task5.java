import java.util.Scanner;

public class task5 {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of diamond: ");
        int n = sc.nextInt();

        int primeNum = 2;

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    // Print prime numbers at boundary
                    while (!isPrime(primeNum)) {
                        primeNum++;
                    }
                    System.out.print(primeNum);
                    primeNum++;
                } else {
                    System.out.print(" "); // Hollow space
                }
            }
            System.out.println();
        }

        // Lower part of the diamond (Hollow)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    // Print prime numbers at boundary
                    while (!isPrime(primeNum)) {
                        primeNum++;
                    }
                    System.out.print(primeNum);
                    primeNum++;
                } else {
                    System.out.print(" "); // Hollow space
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
