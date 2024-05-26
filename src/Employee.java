public class Employee {
    private String name;
    private int daysWorked;
    private int dailyWage;

    public Employee(String name, int daysWorked, int dailyWage) {
        this.name = name;
        this.daysWorked = daysWorked;
        this.dailyWage = dailyWage;
    }

    public Integer calculateSalary() {
        return daysWorked * dailyWage + calculatePrim();
    }

    public Integer calculatePrim() {
        return daysWorked > 25 ? (daysWorked - 25) * 1000 : 0;
    }
}
