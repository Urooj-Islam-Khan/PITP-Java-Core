public class task1 {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 5;
        System.out.println("Before Swap");
        System.out.println("number 1: " + num1);
        System.out.println("number 2: " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After Swap ");
        System.out.println("number 1: " + num1);
        System.out.println("number 2: " + num3);

    }
}
