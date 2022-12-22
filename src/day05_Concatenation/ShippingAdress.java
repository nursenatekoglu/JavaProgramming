package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {
        /*
        name (String)
        building number (String)
        street name (String)
        city (String)
        state (String)
        zipCode (String)
         */

        String name = "Olivia Green",
                buildingNumber = "28C",
                streetName = "Philis Street",
                city = "Sheffield",
                state = "South Yorkshire",
                zipCode = "S7 8PX";

      //  System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + "\n" + zipCode);

String shippingAddress= name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + "\n" + zipCode;
        System.out.println(shippingAddress);

/*
Create a class called ShippingAddress.java
Declare the following variables:
    1. name
    2. buildingNumber
    3. streetName
    4. city
    5. state
    6. zipCode
Use concatenation to print the full address
 */



    }

}
