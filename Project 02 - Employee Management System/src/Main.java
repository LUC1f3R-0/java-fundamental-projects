import User.FullTimeEmployee;
import User.PartTimeEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter employee type (1 - Full-Time, 2 - Part-Time): ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> fulTime(sc);
                    case 2 -> partTime(sc);
                    default -> throw new ExceptionHandler("Error");
                }
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    private static void fulTime(Scanner sc) throws ExceptionHandler {
        while (true) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter base salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter bonus: ");
            int bonus = sc.nextInt();

            if(Validation.isValid(FieldType.NAME, name) && Validation.isValid(FieldType.ID, id) && Validation.isValid(FieldType.SALARY, salary) && Validation.isValid(FieldType.BONUS, bonus)){
                FullTimeEmployee fulTimer = new FullTimeEmployee(name, id, salary, bonus);

                System.out.println(fulTimer);
            }
        }
    }

    private static void partTime(Scanner sc) throws ExceptionHandler{
        while (true) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter base salary: ");
            double salary = sc.nextDouble();

            System.out.print("Hours worked: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter hourly rate: ");
            int rate = sc.nextInt();
            sc.nextLine();

            if(Validation.isValid(FieldType.NAME, name) && Validation.isValid(FieldType.ID, id) && Validation.isValid(FieldType.SALARY, salary) && Validation.isValid(FieldType.HOURS, hours)&& Validation.isValid(FieldType.RATE, rate)){
                PartTimeEmployee partTimer = new PartTimeEmployee(name, id, salary, hours, rate);
            }

        }
    }
}