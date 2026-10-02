import java.util.Scanner;
class Employee
{
    int emp_id;
    String emp_name;
    float emp_salary;
    public void display(int emp_id, String emp_name, float emp_salary)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        System.out.println("Id is: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Salary: " + emp_salary);
    }
}
public class Emp
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Scanner emp = new Scanner(System.in);
        System.out.println("Enter the Id:");
        int e_id = emp.nextInt();
        emp.nextLine();
        System.out.println("Enter the Name:");
        String e_name = emp.nextLine();
        System.out.println("Enter the salary:");
        float e_salary = emp.nextFloat();
        e1.display(e_id, e_name, e_salary);
        emp.close();
    }
}