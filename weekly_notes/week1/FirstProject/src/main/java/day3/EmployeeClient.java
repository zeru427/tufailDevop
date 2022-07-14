package day3;

public class EmployeeClient {

    public static void main(String[] args) {
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.employeeId=100;
        contractEmployee.employeeName="Daniel";
        contractEmployee.contractDuration=50;
        contractEmployee.payPerHour=30;

        //Object --> Employee -> ContractEmployee
        //Object class is the super class for all the classes in java
    }
}
