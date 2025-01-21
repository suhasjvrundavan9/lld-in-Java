package org.example.creational.builder;

public class Employee {

    private String name;
    private String company;
    private boolean hasBike;
    private boolean hasCar;

    private Employee(EmployeeBuilder employeeBuilder){
        this.name = employeeBuilder.name;
        this.company = employeeBuilder.company;
        this.hasBike = employeeBuilder.hasBike;
        this.hasCar = employeeBuilder.hasCar;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public boolean isHasCar() {
        return hasCar;
    }


    public static class EmployeeBuilder{
        private String name;
        private String company;
        private boolean hasBike;
        private boolean hasCar;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public Employee build(){
            if (name == null || company == null) {
                throw new IllegalStateException("Name and Company must be provided");
            }

            return new Employee(this);
        }
    }
}
