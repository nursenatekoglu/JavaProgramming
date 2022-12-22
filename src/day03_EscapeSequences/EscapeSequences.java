package day03_EscapeSequences;
/*
Escape sequences: MUST be given with double quote
\n : starts a new line
\t : tab
\\ : prints single backward slas
\" : prints double quote
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPyhton \nC#");
        System.out.println("---------------------------------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("---------------------------------");

        System.out.println("\tJava is cool programming language");
        System.out.println("---------------------------------");

        System.out.println("/ \\"); //in order to print one backward slash we need to give two backward slashes
        System.out.println("---------------------------------");

        System.out.println("My favourite TV show is \"Game of Thrones\""); //in order to create double quote, we need to use /"



    }

}
