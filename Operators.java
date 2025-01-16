public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multily: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Comparision Operators
        System.out.println("\nComparission Operators");
        System.out.println("== " + (a == b));
        System.out.println("< " + (a < b));
        System.out.println("> " + (a > b));
        System.out.println("<= " + (a <= b));
        System.out.println(">= " + (a >= b));
        System.out.println("!= " + (a != b));

        boolean c1 = (a < b);
        boolean c2 = (a > b);

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("And " + (c1 && c2));
        System.out.println("Or " + (c1 || c2));
        System.out.println("Not " + (!c1));
    }
}
