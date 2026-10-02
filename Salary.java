class Employee
{
    double salary(double basicPay)
    {
        return basicPay;
    }
    double salary(double basicPay, double DA)
    {
        return basicPay + DA;
    }
    double salary(double basicPay, double allowances, double DA, double bonus)
    {
        return basicPay + allowances + DA + bonus;
    }
}
public class Salary
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        System.out.println("Salary based on basic pay = " + e.salary(20000));
        System.out.println("Salary based on basic pay and DA = " + e.salary(20000, 5000));
        System.out.println("Salary based on basic pay, allowances, DA and bonus = " + e.salary(20000, 3000, 5000, 4000));
    }
}