package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int n = 11;

        String name = (n==1)? "January" :(n==2)? "Feb" :(n==3)? "March" :(n==4)? "April" :(n==5)? "May" :(n==6)? "June"
                :(n==7)? "July" :(n==8)? "August" :(n==9)? "Sept" :(n==10)? "Oct" :(n==11)? "Nov" : "Dec";

        System.out.println(name);

    }

    }

