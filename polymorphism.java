class overloading {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(float a, float b, float c) {
        System.out.println(a + b + c);
    }

}

public class polymorphism extends overloading {

    public void sum(double c, double d) {
        System.out.println(c + d);
    }

    public static void main(String[] args) {
        // polymorphism me hm classes inherit krte hain methods ko override and overload
        // krne k lie

        polymorphism obj = new polymorphism();
        obj.sum(2, 3);
        obj.sum(3, 4, 5);
        obj.sum(3.5, 6.7);
        // method overloading me functiona k same name or different parameters use krte
        // hain, isme inheritance lazmi nhi hoti hy

        // method overriding me functiona k same name or same parameters use krte hain,
        // isme inheritance lazmi hoti hy
    }
}
