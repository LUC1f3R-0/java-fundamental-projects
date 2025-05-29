import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter student age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student GPA: ");
            double gpa = sc.nextDouble();

            if (Validator.isValid(name) && Validator.isValid(age) && Validator.isValid(gpa)) {
                Student one = new Student(name, age, gpa);

                System.out.println("---- Student Record ----");
                System.out.println(one);


            } else {
                throw new ExceptionHandler("Error");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}