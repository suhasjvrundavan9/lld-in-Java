package org.example.creational.builder;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee.EmployeeBuilder().
                setName("suhas").
                setCompany("google").
                setHasBike(true).
                setHasCar(false).
                build();

        System.out.println(e.getName() + " " + e.getCompany() + " " + e.isHasBike() + " " + e.isHasCar());
    }
}
