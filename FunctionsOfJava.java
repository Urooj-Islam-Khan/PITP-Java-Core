public class FunctionsOfJava {

    // non return non parameter function
    public void greeting() {
        System.out.println("Hello");
    }

    // return function non parameter
    public int num() {
        return 2 + 5;
    }

    // parameter function non return
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    // parameter function and return
    public int sum2(int a, int b) {
        return (a + b);
    }

    // static direct call hota hai
    // public k lie object bnana prta
    public static void main(String[] args) {
        FunctionsOfJava obj = new FunctionsOfJava(); // creting an object of a class

        obj.greeting();
        System.out.println(obj.num());
        obj.sum(2, 4);
        System.out.println(obj.sum2(7, 4));

        // return type function System.out.println(); me use krte hain variable store kr
        // k
    }
}
