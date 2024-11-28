package EmployeeWorkerProblem;

public class Manager extends Employee{
    private double bonus;
    Manager(String name,double baseSalary,double bonus){
    setName(name);
    setBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager name : " + getName() + "Manager Salary: " + getSalary();
    }
}
