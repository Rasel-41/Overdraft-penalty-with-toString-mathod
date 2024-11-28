package EmployeeWorkerProblem;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Rasel");
        employee.setBaseSalary(50000);
        System.out.println(employee);
        System.out.println();
        Manager manager = new Manager("Humaira",50000,10000);
        System.out.println(manager);

    }
}
