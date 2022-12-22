package day37_Inheritence.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1= new Dog("Alex", "Husky", 'M', 1, "small", "White");

        System.out.println(dog1);

        dog1.bark();


        Cat cat1= new Cat("Love", "Domestic",'F', 2, "Small", "Gray");

        System.out.println(cat1);

        //cat1.bark();
        cat1.scratch();


        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Medium", "Green");

        System.out.println(parrot1);

        parrot1.sing();
        //parrot1.bark();
        //parrot1.scratch();


    }

}
