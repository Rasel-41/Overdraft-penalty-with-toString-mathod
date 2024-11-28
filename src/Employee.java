public class Employee {
    private String name ;
    private double baseSalary;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }


    public String toString() {
        return "Employee name :" + getName() + " Base salary :" + getSalary();
    }
}
