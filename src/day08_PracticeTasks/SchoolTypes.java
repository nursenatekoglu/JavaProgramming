package day08_PracticeTasks;

public class SchoolTypes {
    public static void main(String[] args) {

        int gradeLevel=18;

        if (gradeLevel>=1 && gradeLevel<=5 ){
            System.out.println("Elementary School");
        }else if (gradeLevel>=6 && gradeLevel<=8){
            System.out.println("Middle School");
        }else if (gradeLevel>=9 && gradeLevel<=12){
            System.out.println("High School");
        }else if (gradeLevel>=13 && gradeLevel<=16){
            System.out.println("College");
        }else {
            System.out.println("Grad School");
        }

    }
}

/*
2.  Given a number(byte) grade level determine and print which school type someone is in.

        grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School

        Assume that the given number is 1 ~ 18

 */