public class Hierarchical_Inheritance {
    public void electronic() {
        System.out.println("An electronic machine");
    }

    public static void main(String[] args) {

        Laptops obj = new Laptops();
        obj.electronic();
        obj.laptop();
        Speakers obj2 = new Speakers();
        obj2.electronic();
        obj2.speaker();
    }
}

class Laptops extends Hierarchical_Inheritance {
    public void laptop() {
        System.out.println("Laptop is electronic machine");
    }
}

class Speakers extends Hierarchical_Inheritance {
    public void speaker() {
        System.out.println("Speakers is electronic machine");
    }
}
