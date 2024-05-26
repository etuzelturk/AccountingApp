import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the employee name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Please enter the number of days "+ name +" worked:");
        Scanner in = new Scanner(System.in);
        int numOfDays = in.nextInt();

        System.out.println("Please enter the employee daily wage: ");
        int wage = in.nextInt();

        Employee employee = new Employee(name, numOfDays, wage);
        System.out.println("Employee Salary: "+employee.calculateSalary() + " (Wage: "+(employee.calculateSalary()-employee.calculatePrim()) +", Bonus: "+employee.calculatePrim()+")");
    }
}