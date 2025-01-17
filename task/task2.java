public class task2 {
    public static void main(String[] args) {
        int a = 10; // 01010
        int b = 20; // 10100
        System.out.println("Before swapping a: " + a + " b: " + b);
        a = a ^ b; // 11110
        b = a ^ b; // 01010
        a = a ^ b; // 10100
        System.out.println("After swapping a: " + a + " b: " + b);
    }

}
