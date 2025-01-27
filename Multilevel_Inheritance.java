public class Multilevel_Inheritance {
    public void animal() {
        System.out.println("This is Animal Method");
    }

    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.animal();
        obj.dog_Method();
        obj.babyDog_Method();
    }

}

class Dogs extends Multilevel_Inheritance {
    public void dog_Method() {
        System.out.println("Dogs can bark");
    }
}

class BabyDog extends Dogs {
    public void babyDog_Method() {
        System.out.println("this is baby dog's class");
    }
}
