package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        /*
    create a class named Castings
    1. declare a variable of float named averageScore and initialize it to 20.5
    2. declare the following variables and assign averageScore to each of them:
                 byte num1;
                 short num2;
                 int num3;
                 long num4;
                 float num5
                 double num6;
         */

        float averageScore=20.5F;
        byte num1= (byte) averageScore;
        short num2= (short) averageScore;
        int num3=(int) averageScore;
        long num4= (long) averageScore;
        float num5=averageScore;
        double num6= averageScore;

        /*

        byte num1 = (byte)averageScore; //explicit casting
        short num2 = (short) averageScore;  //explicit casting
        int num3 = (int) averageScore;//explicit casting
        long num6 = (long) averageScore; //explicit casting
        float num4 = averageScore; // no casting
        double num5 = averageScore; // implicit casting

 implicit casting: casting smaller type to larger
 explicit casting: casting the larger type to smaller

         */

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

    }
}


