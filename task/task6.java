import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of X pattern (odd number): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(j); // Print * at diagonals
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
