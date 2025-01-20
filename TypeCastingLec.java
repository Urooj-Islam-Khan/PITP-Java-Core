public class TypeCastingLec {
    public static void main(String[] args) {

        // Type casting is when you assign a value of one primitive data type to another
        // type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type
        // size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size
        // type
        // double -> float -> long -> int -> char -> short -> byte

        int myInteger = 10;
        int Int;
        double myDouble = 3.14;
        double Double;
        ;

        // Widening typecasting
        System.out.println("Widening typecasting");
        Double = myInteger;
        System.out.println(Double);

        // Narrowing typecasting
        System.out.println("Narrow typecasting");
        Int = (int) myDouble;
        System.out.println(Int);

    }
}
