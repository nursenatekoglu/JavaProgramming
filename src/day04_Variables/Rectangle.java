package day04_Variables;

public class Rectangle {
    /*
Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
length, width, area, perimeter

area = length * width
perimeter =  2 * (length + width)
     */

    public static void main(String[] args) {

        double length = 10.5;
        double width = 5.5;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}
