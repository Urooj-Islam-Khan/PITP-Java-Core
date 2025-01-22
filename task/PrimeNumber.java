public class PrimeNumber {
    public static void main(String[] args) {

        int limit = 50; // Prime numbers 50 tak print krne ke liye

        System.out.println("Prime numbers up to " + limit + ":");
        int i;
        for (int num = 2, count; num <= limit; num++) {
            count = 0;

            for (i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    break; // Agar divisible ho, tou loop se break kar lo
                }
            }

            if (count == 0) {
                System.out.print(num + " ");
            }
        }

    }

}
