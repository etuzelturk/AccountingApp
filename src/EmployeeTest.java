import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeTest
{
    //---Without DataProvider---
    private Employee employee1;
    private Employee employee2;

    @BeforeClass
    public void setUp() {
         employee1 = new Employee("Luke Skywalker", 26, 100);
         employee2 = new Employee("Jar Jar Binks", 10, 90);
    }

    @Test
    public void testCalculateSalary(){

        int expectedSalary = 26 * 100 + 1000;
        Assert.assertEquals(employee1.calculateSalary(), Integer.valueOf(expectedSalary));
    }

    @Test
    public void testCalculatePrim1() {

        int expectedPrim = 1000;
        Assert.assertEquals(employee1.calculatePrim(), Integer.valueOf(expectedPrim));
    }

    @Test
    public void testCalculatePrim2() {

        int expectedPrim = 0;
        Assert.assertEquals(employee2.calculatePrim(), Integer.valueOf(expectedPrim));
    }

    //---With DataProvider---
    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][] {
                {"Luke Skywalker", 26, 100, 3600, 1000},
                {"Han Solo", 15, 150, 2250, 0},
                {"Leia Organa", 30, 250, 12500, 5000}
        };
    }
    @Test(dataProvider = "dp")
    public void testCalculateSalary3(String name, int daysWorked, int dailyWage, int expectedSalary, int expectedPrim) {
        Employee employee = new Employee(name, daysWorked, dailyWage);
        Assert.assertEquals(employee.calculateSalary(), Integer.valueOf(expectedSalary));
        Assert.assertEquals(employee.calculatePrim(), Integer.valueOf(expectedPrim));
    }
}
