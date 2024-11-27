public class mainC{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Raesl");
        employee.setBaseSalary(5000);


        Manager manager = new Manager("Shamim Hasan",5000,10000);

        System.out.println(manager);

    }
}
