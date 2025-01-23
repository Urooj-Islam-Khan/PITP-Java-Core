import java.util.Scanner;

public class task9 {
    public int add(int a, int b) {
        return (a + b);
    }

    public int sub(int a, int b) {
        return (a - b);
    }

    public int mul(int a, int b) {
        return (a * b);
    }

    public int div(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("\nEnter Second Number: ");
        int b = sc.nextInt();
        System.out.print("\nEnter any Operator(+,-,*,/): ");
        char op = sc.next().charAt(0);

        System.out.println();
        task9 obj = new task9();
        float sumFun = obj.add(a, b);
        float subFun = obj.sub(a, b);
        float mulFun = obj.mul(a, b);
        float divFun = obj.div(a, b);
        switch (op) {
            case '+':
                System.out.println(sumFun);
                break;
            case '-':
                System.out.println(subFun);
                break;
            case '*':
                System.out.println(mulFun);
                break;
            case '/':
                System.out.println(divFun);
                break;

            default:
                System.out.println("Irrelevant Input");

                break;
        }
    }
}
