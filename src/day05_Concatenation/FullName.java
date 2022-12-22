package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String name = "Nursena";
        String surname = "Green";

        String fullName = name + " " + surname ;
        System.out.println(fullName );

        // Full name of the person is _______ .

        System.out.println("Full name of the person is " + fullName + ".");

        // ____ is __ years old.

        int age = 27;

        System.out.println(fullName + " is " +  age + " years old.");

        //____ is ____ , works at ______ .

        String jobTitle = "SDET";
        String companyName = "Apple Inc";

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ".");


    }
}
