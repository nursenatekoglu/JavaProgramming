package day04_Variables;

public class Square {
    /*
 Create a class named Square, write a program that can calculate the area & perimeter of any given square
 side

area = side * side;
perimeter = 4 * side
     */

    public static void main(String[] args) {
//DataType VariableName = Data;

double side = 5.5;

double area = side * side;
double perimeter = 4 * side;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}
