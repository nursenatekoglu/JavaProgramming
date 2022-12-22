package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Amy";
        String citizen = "UK";
        int age = 16;

        if (citizen=="UK" && age>=18){
            System.out.println(name + " is eligible to vote");
        }else{
            System.out.println(name + " is NOT eligible to vote");
        }




    }
}

/*
4. Write a program that can check if the person is eligible to vote
 */