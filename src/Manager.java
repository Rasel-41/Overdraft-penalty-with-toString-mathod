public class Manager extends Employee {

    private double bonas;

    Manager(String name, double baseSalary, double bonas) {

        this.bonas = bonas;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonas;
    }

    @Override
    public String toString() {
        return "Manager bonose :" + getSalary();
    }
}


