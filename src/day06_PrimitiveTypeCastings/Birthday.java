package day06_PrimitiveTypeCastings;

public class Birthday {
    public static void main(String[] args) {

        String name="Nursena";
        int birthDay=18;
        String month="November";
        int birthYear=1994;

        System.out.println(name + " was born on" + " " + month + "/" + birthDay + "/" + birthYear + ".");

        System.out.println( "------------------------------------------------------");

        //My favourite book is "bookName".

        String bookName="Lord Of The Rings";

        System.out.println("My favourite book is" + " \"" + bookName + "\"" + "." );




    }
}

/*
1. Create a class named BirthDay and create the following variable
name, birthDay(int), birthMonth(String), birthYear(int)

use concatenation to display the birthday of the person

		if  name = "John"
			birthDay = 25
			birthMonth = "April"
			birthYear = 1995;

output:
John was born on April/25/1995.
 */