public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String _name, int _age, double _gpa) {
        this.name = _name;
        this.age = _age;
        this.gpa = _gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Name: %s \nAge: %d \nGPA: %.2f", getName(), getAge(), getGpa());
    }
}
