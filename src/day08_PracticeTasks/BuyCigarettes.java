package day08_PracticeTasks;

public class BuyCigarettes {
    public static void main(String[] args) {

        byte age = 17;
        boolean isEligibleToBuyCigarettes = age>=18;

        if (isEligibleToBuyCigarettes){
            System.out.println("The person is eligible to buy cigarettes");
        }else{
            System.out.println("The person is NOT eligible to buy cigarettes");
        }

    }
}

/*
1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */