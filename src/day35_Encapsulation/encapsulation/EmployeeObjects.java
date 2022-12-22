package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);
        System.out.println(employee1);


        Employee employee2 = new Employee("Tahir", 'M', 30, 120000);
        employee2.setAge(32);


        Employee employee3 = new Employee("Aygun", 'F', 31, 115000);
        employee3.setName("Elvira");
        employee3.setSalary( employee3.getSalary() + 15000 );


        System.out.println(employee2);
        System.out.println(employee3);


    }

}

