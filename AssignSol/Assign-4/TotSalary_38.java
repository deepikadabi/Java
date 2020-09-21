/*38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
    a.	Only parameterized constructor. [Do not overload the constructor]
    b.	totalSalary always represents salary total of all the employees created.
    c.	empNo should be auto incremented.
    d.	display total employees and totalSalary using a method.
    Create another class EmployeeDemo (main class) that creates some Employee objects and
     calls Employee method to display no. of employees and total of their salaries.
*/
import java.util.Scanner;
class Employee{
    private int empNo;
    private float salary;
    private String empName;
    static float totalSalary;

    Employee(int empNo, String empName, float salary){
        this.empNo = empNo;
        this.salary = salary;
        this.empName = empName;
        this.totalSalary = totalSalary+salary;

    }
    void show(){
        //totalSalary = totalSalary+salary;
        System.out.println("Employee number : "+empNo+"  Name:  "+empName+"  Salary : "+salary+"  Total Salary : "+totalSalary);
    }

   
}

public class TotSalary_38 {
    public static void main(String args[]) {
        //Employee emp = new Employee();
        System.out.println("Enter number of employee : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n;i++){
            System.out.print("Enter salary of "+i+" & "+" Emplyee Name : ");
            int sal = sc.nextInt();
            String name = sc.next();
            Employee emp = new Employee(i, name, sal);
            emp.show();

        }

    }
}
