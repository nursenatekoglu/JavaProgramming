package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {

    int year = 2019;
    String make = "BMW";
    String model = "X6";
    String miles = "1500 miles";
    String color = "Night Blue";
    String price = "60,000 GBP";

        System.out.println(year + " " + make + " " + model + ", " + miles + ", " + color + ", " +price +".");

    }

}

/*
Create a class called CarInfo.java
Declare the following variables:
    1. year
    2. make
    3. model
    4. miles
    5. color
    6. price
Use concatenation to print the full info of the car in the following format:
Year Make Model, Miles, Color, Price.

Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */