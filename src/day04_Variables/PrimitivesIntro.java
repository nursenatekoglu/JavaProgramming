package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // age : 38 years old
        byte age = 38;

        //weight : 160 pounds
        // byte weight = 160; // 160 is out of byte's range -> it is an error
        short weight = 160; //160 is within the range of short

        //salary : 100000 $
        // short salary=100000; //100000 is out of short's range -> it is an error
        int salary = 100000; // int is the preferred data type for the integer numbers

        long asset = 3_333_333_333L;

        //tax : 0.26
        float tax = 0.26F;
        double PI = 3.14; // double is the preferred data type for the integer numbers

boolean isEmployed= true;
boolean isMarried= false; // final value must be true or false

boolean result = 100 > 300; // or if you can assign the result as true or false

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name= "Wooden Spoon";
        String city= "McLean";
        String state= "Virginia";
        String country= "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

    }

}
