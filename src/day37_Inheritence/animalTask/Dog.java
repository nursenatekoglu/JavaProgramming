package day37_Inheritence.animalTask;

public class Dog extends Animal{

    public Dog ( String  name, String breed, char gender, int age, String size, String color){

        super(name, breed, gender, age, size, color); //super class constructor call

    }

    public void bark(){
        System.out.println( name + " is barking");
    }

}
