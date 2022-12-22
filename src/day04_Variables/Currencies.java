package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        // dollar-> lira, euro, pound, jpy, peso, cad, riyal

        int dollar = 1000;

        double lira = dollar * 18.24 ;
        double euro = dollar * 0.98 ;
        double pound = dollar * 0.85 ;
        double jpy = dollar * 142.23 ;
        double peso = dollar * 19.80 ;
        double cad = dollar * 1.30 ;
        double riyal = dollar * 3.76 ;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);

    }

}
