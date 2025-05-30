package User;

public class Employee {
    private final String id;
    private String name;
    private double finalSalary;

    public Employee(String _id, String _name, double _finalSalary) {
        this.id = _id;
        this.name = _name;
        this.finalSalary = _finalSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }
}
