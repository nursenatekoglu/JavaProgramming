package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "brown");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();
        //dog.scratch();

        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Ceviz", "Domestic", 'F', 1, "medium", "brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        cat.scratch();

        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "Bengal", 'M',4, "large", "orange" );

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);



    }
}
