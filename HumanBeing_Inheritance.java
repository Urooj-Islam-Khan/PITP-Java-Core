public class HumanBeing_Inheritance {

    public void work() {
        System.out.println("They can engage in multiple professions...");
    }

    public static void main(String[] args) {

        // inheritance me 4 types hoti hain or java 3 ko suppport krta hain
        // 1: Signle Inheritance is me do classes hoti hain ek class dusre se inherit
        // krti hain
        // 2: Multilevel is me child ka child b parent ki khubi leskta hain
        // 3: Hierarchical is me ek parent ho or bache bht
        // ye java support nhi krta 4 ko
        // multiple is me do parents ek bacha hota hai

        Profession obj = new Profession();
        obj.work();
        obj.teachers();
        obj.students();

    }
}

class Profession extends HumanBeing_Inheritance {

    public void teachers() {
        System.out.println("As a Teacher...");
        System.out.println("They can teach");
    }

    public void students() {
        System.out.println("As a Students...");
        System.out.println("They can learn");
    }
}
