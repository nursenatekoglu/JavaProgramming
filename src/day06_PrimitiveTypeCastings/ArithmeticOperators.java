package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1); // 121 , concatenation

        System.out.println(12+1); //13, addition
        System.out.println(100-50); //50, subtraction
        System.out.println(10*6); //60, multiplication

        System.out.println(100/3); //33, division
        System.out.println(10/4); //2
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println( (double)10 /4); //2.5
        System.out.println( 10d/4); //2.5 , d stands for decimal number


        int a = 100;
        double b= a/6; //16.0
        System.out.println(b);

        double c = a/6.0; //16.66666
        System.out.println(c);





    }
}

/*

+ : Addition
- : Subtraction
* : Multiplication
/ : Division
% : Remainder

 */